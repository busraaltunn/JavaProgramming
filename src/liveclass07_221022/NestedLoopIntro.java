package liveclass07_221022;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("outer loop: "+i+" inner loop: "+j);  //herbiri 5 kez yazılacağından 5*5=25

            }
        }

        System.out.println("--------------------------");

        int starNumberColumn = 7;
        int starNumberRow = 4;

        for (int i = 0; i <= starNumberRow  ; i++) {    //row number
            for (int j = 0; j <=starNumberColumn ; j++) {   //column number
                System.out.print("*");  //7 times, ln'siz print(yan yana)

            }

            System.out.println();  //her 7  de alta geçsin diye,sonuçta ilk for un içinde
        }
//(ödev: bu şekli tek for kullanarak yap, tek * kullanarak)
    }
}
