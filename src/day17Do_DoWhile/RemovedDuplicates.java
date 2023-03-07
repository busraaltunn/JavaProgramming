package day17Do_DoWhile;

public class RemovedDuplicates {

    public static void main(String[] args) {

        String str =  "AABBCC";
        String result =  "";


        for (int i = 0; i <= str.length()-1; i++) {

            String  ch =""+str.charAt(i);//AABBCC  //charla yazmadık, contains sadece  String ile kullanılır, so "" kullandık

            if(result.contains(ch)){   //ch'nin zaten içerdiklerini  atladı with continue
                continue;  //skips      //break result= A
            }
            result +=ch;

        }

        System.out.println(result);




    }
}
