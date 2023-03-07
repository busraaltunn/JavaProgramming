package liveclass07_221022;

public class SystemExist {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if (i==3)
        System.exit(0);   // break result=0,1,2,after break
            System.out.println(i);
        }

        System.out.println("after break");



    }
}
