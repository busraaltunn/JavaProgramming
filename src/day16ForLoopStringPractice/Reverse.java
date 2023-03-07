package day16ForLoopStringPractice;

public class Reverse {

    public static void main(String[] args) {


        String word = "Wooden Spoon";
        String result ="";

        /*
        result += word.charAt(word.length()-1); //last index number,11(we can find)
        result += word.charAt(10);
        result += word.charAt(9);
        result += word.charAt(8);
        result += word.charAt(7);
        result += word.charAt(6);
        result += word.charAt(5);
        result += word.charAt(4);
        result += word.charAt(3);
        result += word.charAt(2);
        result += word.charAt(1);
        result += word.charAt(0);

        System.out.println(result);

        System.out.println("--------------------------");

        */

        for (int i = word.length()-1; i >=  0; i--) {   //lenght'ten 11'i bulabiliriz.
            result += word.charAt(i);
        }


        System.out.println(result);



    }
}
