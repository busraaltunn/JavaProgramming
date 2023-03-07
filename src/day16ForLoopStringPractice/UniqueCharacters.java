package day16ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {


        String str = "aaabccc";
        String result = "";


        if (str.indexOf('a')==str.lastIndexOf('a')){
            result += "a";
            
        }else if (str.indexOf('b')==str.lastIndexOf('b')){
            result += "b";

        } else if (str.indexOf('c')==str.lastIndexOf('c')){
            result += "c";
            
        }

        System.out.println(result);

    }
}
