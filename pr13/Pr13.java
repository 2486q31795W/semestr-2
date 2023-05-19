package Semestr2;
import java.util.Scanner;
public class Pr13 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        int number3 = s.nextInt();
        int y = 0;
        if(number1 < number2){
            if(number2 < number3){
                while(y < number3){
                    System.out.println(number1);
                    y++;
                    number1 += number2;
                }
            }
        }
    }
}
