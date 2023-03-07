package day13String;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";
        char index = word.charAt(3);

        System.out.println(index);

        System.out.println("--------------------------------------");

        String me = "My name is Busra, I graduated  from middle east techinical university";
                int sentenceLength = me.length();
        System.out.println("Sentence length=" + sentenceLength);

        System.out.println("--------------------------------------");

        String words = "busra altun";
        String  upperWords = words.toUpperCase();

        System.out.println("words=" + upperWords);





    }
}
