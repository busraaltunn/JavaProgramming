package day17Do_DoWhile;

public class BranchingStatement2_Continue {

    public static void main(String[] args) {

        for (char i ='A'; i <='E' ; i++) {

            if(i=='C'){
                continue;
            }
            System.out.println(i);  //A,B,D,E   --> if it is break= just A,B
        }

        System.out.println("---------------------");

        for (int i = 0; i <=10 ; i+=2 ) {
            System.out.println(i);

        }


        System.out.println("--------------");

        for (int i = 1; i <10 ; i+=2) {
            System.out.println(i);

        }





    }
}
