package day17Do_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {


        String str= " Cat Cat Dog Dog CAT cAT CAt";
        int frequency= 0 ;       //Cat'in kaç kez tekrarlandığı


        for (int i = 0; i <= str.length()-3; i++) {
            String  eachSub = str.substring(i,i+3); //3  indexlibir kelime olduğundan 3 olur (Cat)

            if (eachSub.equalsIgnoreCase("Cat")){
                frequency++;
            }

        }

        System.out.println(frequency);




    }


}
