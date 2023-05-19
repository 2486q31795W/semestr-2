package Semestr2;
import java.util.Arrays;
import java.util.Scanner;
public class Pr12 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int number1 = x.nextInt();
        int number2 = x.nextInt();
        if(number1 < number2){
            while(number1 <= number2){
                System.out.println(number1*number1);
                number1++;
            }
        }
        if(number2 < number1){
            while(number2 <= number1){
                System.out.println(number2*number2);
                number2++;
            }
        }
    }
}
