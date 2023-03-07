package day17Do_DoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Will you  marry me?yes/no");
        String a= scan.next().toLowerCase();

        while (!(a.equalsIgnoreCase("yes")  || a.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer, please re-entered");
            a= scan.next().toLowerCase();
        }


        if (a.equals("yes")){
            System.out.println("Congrats");
        }else {
            System.out.println("Goodbye");
        }









    }
}
