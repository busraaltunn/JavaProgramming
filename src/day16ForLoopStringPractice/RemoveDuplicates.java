package day16ForLoopStringPractice;

public class RemoveDuplicates {

    public static void main(String[] args) {


        String str = " aabbaacc";
        String  result = ""; //abc

        for (int i = 0; i <= str.length()-1 ; i++) {

            String ch = "" + str.charAt(i);       //başta "" olmasaydı char ile yazmalıydık, string ile değil.

        if (!result.contains(ch)){   //içermediğinde eklemeye  devam ediyor
                                        // += olduğundan da peş peşe ekliyor
            result += ch;

        }
    }

        System.out.println(result);




    }
}
