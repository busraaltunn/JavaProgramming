package day15StringForLoop;

public class ReplaceX {

    public static void main(String[] args) {
        String str = "xcodeX";

        String result = str.replace("x", "a").replace("X", "a");
        //  "acodeX"                                 "acodea"

        System.out.println(result);



    }
}
