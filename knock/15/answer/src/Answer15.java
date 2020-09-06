public class Answer15 {
    // java.lang.String型のインスタンス変数を持つクラスで、
    // コンストラクタでその変数に代入すべき値を取る場合と、取らない場合がある。
    // 取らない場合、デフォルトの文字列"no name"を設定する。このクラスを実装せよ。
    public static void main(String[] args) {
        System.out.println(new Second().word);
        System.out.println(new Second("hogehoge").word);
    }
}

class Second {
    public String word;

    public Second() {
        this.word = "no name";
    }

    public Second(String value) {
        this.word = value;
    }
}
