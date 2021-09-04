public class Task1_5 {

    public static void main(String[] args) {

        String[] fruits = {"みかん","りんご","ぶどう","メロン"};

        for (int i = 0 ; i < fruits.length ; i++){
            System.out.println( fruits[i]);
        }
        //変数を１で初期化し、1から100までを出力するように指示している
        int i = 1;
        while(i <= 100) {
            System.out.print(i);
            i++;
        }
        System.out.println();

        for (int j = 1; j <= 9; j++){
            for (int k = 1; k <= 9; k++){
                if ( k == 1){
                    System.out.print( j*k + "||");
                }
                System.out.print( j*k + "|");
            }
            System.out.println();
        }
    }
}