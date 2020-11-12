public class practice_2_3 {
    public static void main(String[] args) {
        System.out.println("ようこそ占いの館へ");

        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();

        System.out.println("あなたの年齢を入力してください");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);

        int fortune = new java.util.Random().nextInt(4);
        fortune++;
        System.out.println("占いの結果が出ました！");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.println("1:大吉 2:中吉 3:吉 4:凶");

        String fortuneString = "";
        switch (fortune) {
            case 1:
                fortuneString = "大吉";
                break;
            case 2:
                fortuneString = "中吉";
                break;
            case 3:
                fortuneString = "吉";
                break;
            case 4:
                fortuneString = "凶";
                break;
        }
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortuneString + "です");

        }
}