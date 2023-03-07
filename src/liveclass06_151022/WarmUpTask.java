package liveclass06_151022;

public class WarmUpTask {
    public static void main(String[] args) {

         /*
    - Given a non-empty string like "Code" print a string like below output.
 *                                 Code → "CCoCodCode"
 *                                 abc → "aababc"
 *                                 ab → "aab"
     */

        String word = "mukaddes";

        String temp = "";

        for (int i = 0; i <= word.length(); i++) {
            String str = word.substring(0,i);
            temp +=str;

        }
        System.out.println(temp);


    }
}
