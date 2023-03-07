package liveclass06_151022;

public class T3_PrintWords_important {
    public static void main(String[] args) {

        /*
Task 3: Given a sentence which is string and print the each word.
input:
String str="Java is java in everywhere is Java";
output:
Java
is
java
in
.
.
.
 */

        String str="Java is java in everywhere is Java";
        String word="";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                word += str.charAt(i);
            }
            if(str.charAt(i)== ' ') {
                System.out.println(word);
                word = "";
            }
        }
        System.out.println(word);


    }
}
