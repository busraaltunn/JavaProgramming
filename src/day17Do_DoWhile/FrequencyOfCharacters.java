package day17Do_DoWhile;

public class FrequencyOfCharacters {
    public static void main(String[] args) {


        String str = "AAABBBC";
        char ch =  'A';
        int frequency = 0;

        for (int i = 0; i <= str.length()-1 ; i++) {
            char eachCharacters  = str.charAt(i);

            if (ch==eachCharacters){
                frequency++;
            }
        }


        System.out.println(frequency);



    }
}
