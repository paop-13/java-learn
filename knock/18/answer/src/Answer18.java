// ユニークな名前とIDを持ち、名前とIDどちらでもインスタンスが取得できるenumを実装せよ。
//  例として、十二支を表現するenumを実装せよ。
public class Answer18 {
    public static void main(String[] args) {
        System.out.println(Eto.hebi);
        System.out.println(Eto.hebi.getName());
        System.out.println(Eto.hebi.getId());
    }

    private enum Eto {
        nezumi("子", 1),
        ushi("丑", 2),
        tora("寅", 3),
        usagi("卯", 4),
        tatu("辰", 5),
        hebi("巳", 6),
        uma("午",7),
        hituji("未", 8),
        saru("申", 9),
        tori("酉", 10),
        inu("戌", 11),
        inoshishi("亥", 12);

        private final String name;

        private final int id;

        Eto(final String name, final int id){
            this.name = name;
            this.id = id;
        }

        public String getName(){
            return this.name;
        }

        public int getId(){
            return this.id;
        }
    }
}
