package day17Do_DoWhile;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter first number");
        int num1= scan.nextInt();

        System.out.println("enter second  number");
        int num2 =  scan.nextInt();

        System.out.println("enter math  operator");
        char ch = scan.next().charAt('0');


        while  (!( ch== '+' || ch =='-')){
            System.err.println("Invalid operator, please RE-ENTER");
        }

        System.out.println((ch == '+') ? num1+num2 : num1-num2);


        //HATA VERİYOR İNCELE


    }
}
