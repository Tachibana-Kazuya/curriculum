public class Task1_2 {

    public static void main(String[] args) {

        String[] country = { "JAPAN", "AMERICA", "KOREA"};

        System.out.println( country.length);

        String[] strArray = new String[3];
        strArray[0] = "りんご";
        strArray[1] = "もも";
        strArray[2] = "ぶどう";

        System.out.println( strArray[1]);

        //int[]型の変数intArrayの宣言と初期化
        int[] intArray = { 10, 20, 30, 40, 50 };

        //intArrayの２番目と５番目の合計値を表示するように指示している
        System.out.println(intArray[1] + intArray[4]);

    }
}