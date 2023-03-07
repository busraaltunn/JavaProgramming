package day04practice;

public class Rectangle {
    public static void main(String[] args) {
        //length,width, area, perimeter (variables)

        int length  =  5;
        double width = 3.9;
        double area =  length *  width;
        double perimeter = 2 * (length  + width);

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }
}
