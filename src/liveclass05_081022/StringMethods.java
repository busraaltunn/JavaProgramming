package liveclass05_081022;

import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Adam";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1)); //last character
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String str1 =  "     Adam     ";
        System.out.println(str1.trim());   //trim: remove spaces before and after your string

        String number =  "0123456";
        System.out.println(number.indexOf("34"));  //3'ü aldı, yan yana
        System.out.println(number.indexOf("14"));  //1in yanında 4 olmadığından
        // it will return -1,means that there is no 14 in that string

        String sentence = "Java is programming";
        System.out.println(sentence.indexOf("programming"));
        System.out.println(sentence.indexOf("programmin1"));

        String sentence1 = "Java is Java";
        System.out.println(sentence1.indexOf("Java"));
        System.out.println(sentence1.lastIndexOf("Java"));

        String task = "Hello";
        System.out.println(task.toUpperCase().substring(0,2));

        String task1 = "Wooden";
        System.out.println(""+task1.charAt(4)+task1.charAt(5));

        String word1="Hello";
        int indexOfLastChar = word1.length()-1;
        int indexOfSecondFromLast= word1.length()-2;
        char last = word1.charAt(indexOfLastChar);
        char beforeLast = word1.charAt(indexOfSecondFromLast);
        String  lastTwo= ""+beforeLast+last;
        System.out.println(lastTwo+lastTwo+lastTwo);


        String sentence2 = "Java is a hard prog language";
        System.out.println(sentence2.replace("hard", "easy"));
        System.out.println(sentence2.replace("easy", "fun")); //string=immutable
        System.out.println(sentence2.replace("hard", "fun"));



        String sentence3= "java is not same with java ";
        System.out.println(sentence3.replace("java","c#"));
        System.out.println(sentence3.replaceFirst("java","c#"));



        String subs ="Cydeo";
        String newsubs = subs.substring(1,3);
        System.out.println(newsubs);
        System.out.println(subs.substring(0,2));


        String task4 = "Hello";
        System.out.println(task4.substring(1,task4.length()-1));


        /* Scanner scan = new Scanner (System.in);
        System.out.println("enter a word");
        String word = scan.next();
        If (word<word.length())....devam et
         */



        String  str4= "Adam";
        System.out.println(str4.repeat(4));



        String emptyWord ="";
        System.out.println(emptyWord.isEmpty());
        String emptyWord2 = " ";
        System.out.println(emptyWord2.isEmpty());


        String blankWord =" ";
        System.out.println(blankWord.isBlank());


        String str6 = "Word";
        String str7 = "word";
        System.out.println(str6.equals(str7));
        System.out.println(str6.equalsIgnoreCase(str7));


        System.out.println("---------------------------------");

        String sentence5 = "Java is good  language";
        System.out.println(sentence5.startsWith("Java"));
        System.out.println(sentence5.endsWith("language"));

        System.out.println("-------------------");

        Scanner input = new Scanner (System.in);
        System.out.println("enter a word");
        String word0 = input.next();

        if (word0.startsWith("red")){
            System.out.println("red");
        }else if (word0.startsWith("blue")){
            System.out.println("blue");
        }else{
            System.out.println("");
        }










    }
}
