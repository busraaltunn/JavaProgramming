package day17Do_DoWhile;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("enter username");
        String u  =scan.next();

        System.out.println("enter password");
        String p = scan.next();

        if(u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            int attempts =3;
            while(!(u.equals("Cydeo") && p.equals("Cydeo123") )&&  attempts > 0){   //attempts 1,2,3 olduğunda alttaki sonuçlargeleceğinden  >0 yaptık
                System.out.println("incorrect username or password, please re-enter");
                System.out.println("enter username");
                u= scan.next();   //u'yu birkez string ile tanımladığımız için sonrasında direkt yazarız

                System.out.println("enter password");
                p= scan.next();
                attempts--;   //3-2-1 kez olabilir
            }
        }

        if(u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            System.out.println("Your account is locked");
        }














    }
}
