package day16ForLoopStringPractice;

import javax.sound.midi.Soundbank;

public class DigitsLetterSpecialChars {

    public static void main(String[] args) {


        String str = "Cydeo1234School!@#$%WoodenSpoon";
        String digits =  "";
        String letter = "";
        String specialCharactes  =  "";

        for (int i = 0; i <= str.length()-1; i++) {
            char ch = str.charAt(i);  //each characters in str (stringli yazsaydık başta "" olurdu)

            if (ch>='0' && ch <='9'){
                digits += ch;
            }else if(ch>='A' && ch <='Z'){
                letter += ch;
            }else  if(ch>='a' && ch <='z'){
                letter += ch;
            }else{
                specialCharactes +=  ch;
            }
        }


        System.out.println("Digits= "+ digits);
        System.out.println("Letters= "+ letter);
        System.out.println("Specials chars= "+ specialCharactes);



    }
}
