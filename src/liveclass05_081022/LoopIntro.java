package liveclass05_081022;

public class LoopIntro {

    public static void main(String[] args) {


        String str = "0123456";
        str.charAt(0);
        str.charAt(1);
        for (int index = 0; index < str.length(); index++) {
            System.out.println(str.charAt(index));
        }


        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }


        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);

        }


        for (int i = 1; i < 99; i += 2) {
            System.out.println(i);

        }

/* itar
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }
        */

        for (int i = 100; i > 0; i--) {
            System.out.println(i);

        }


        //Encrypt password----İMPORTANTTTTTTT!!!!!!!!!!

        String password = "Cydeo";
        char encryptWith = 'x';
        String encryptedPassword = "";
        for (int i = 0; i < password.length(); i++) {

            encryptedPassword += "" + password.charAt(i) + encryptWith;

        }

        System.out.println(encryptedPassword);

        System.out.println("----------------");


        boolean result = true;
        if (result) {
            System.out.println("its true");
        }
        if(!result){
            System.out.println("aaa");
        }



        int number =10;
        if(--number>10){
            System.out.println("hello c"+ number);
        }else if(number==9){
            System.out.println("hello w"+number);
        }
    }
}
