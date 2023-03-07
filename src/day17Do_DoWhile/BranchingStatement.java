package day17Do_DoWhile;

import java.util.Scanner;

public class BranchingStatement {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.print(" "+i);

            if(i=='F') {
                break;  //exits to loop

            }
        }


        System.out.println(); //for new line (ln)
        System.out.println("----------------------------");

        Scanner scan = new Scanner(System.in);

        while(true){
        System.out.println("enter  number");
        int n=  scan.nextInt();

        if(n<0){
            System.out.println(("invalid number"));
            break;
        }

        }


    }
}
