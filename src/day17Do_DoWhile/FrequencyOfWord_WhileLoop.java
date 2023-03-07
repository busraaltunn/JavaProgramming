package day17Do_DoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = " Java Java Python Python";
        int frequency = 0;

        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");  //replaceFirst  olması lazım ki, hepilkleri sırayla yapsın. biri gidince diğieri ilk oluyor
            //sadece replace olunca 1 sonucunu verir.
            frequency++;
        }


        System.out.println(frequency);  //neden 1 çıktı sonuç bak

        System.out.println("-------------------------");

        String sentence = "cat cat cat cat dog dog dog cat cat CAT";
        int countCat = 0;

        while (sentence.contains("cat")) {
            sentence = sentence.toLowerCase().replaceFirst("cat", "");  //hepsini "" yapana kadar tekrar edecek ve cat sayısına ulaşacağız

            countCat++;
        }

        System.out.println(countCat);

        System.out.println("-----------------------");


        String s = "java java java pyhton pyhton pyhton";

        int countJava = 0;
        int countPyhton = 0;

        while (s.contains("java") || s.contains("pyhton")) {

            if (s.contains("java")) {
                s = s.replaceFirst("java", "");
                countJava++;
            }

            if (s.contains("pyhton")) {
                s = s.replaceFirst("pyhton", "");
                countPyhton++;
            }
        }

            System.out.println("Java= " + countJava);
            System.out.println("Pyhton= " + countPyhton);


        }
    }
