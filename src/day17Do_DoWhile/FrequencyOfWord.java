package day17Do_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {


        String str = "JavaJavaJavaJavaJava";
        int frequency =  0;

        for (int i = 0; i <= str.length()-4; i++) {
            String  eachSub = str.substring(i,i+4); //i; 3 ten sonrası olamaz zaten toplem index=7

            if (eachSub.equals("Java")){
                frequency++;
            }

        }

        System.out.println(frequency);





    }
}
