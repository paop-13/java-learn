public class Answer16 {
    // 他クラスからインスタンスを作成できないクラスを実装せよ。
    public static void main(String[] args) {
        PrivateClass.staticMethod();
        new PrivateClass();
    }
}

class PrivateClass {
    private PrivateClass() {
        System.out.println("this is private class");
    }

    static public void staticMethod() {
        System.out.println("this is static class");
    }
}
