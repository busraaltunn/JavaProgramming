package day17Do_DoWhile;

public class LoopPractice {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("---------------------------");

        int j=1;
        while (j<=10) {
            j++;  //aldığı değerlere ekleyerek gideceği için 11 de gelir sonuçlarda
            System.out.println(j);
        }

        System.out.println("----------------------------");

        int k=1;
        do{
            System.out.println(k);
            k++;
        }while(k<=10);







    }
}
