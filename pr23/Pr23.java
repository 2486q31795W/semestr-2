package Semestr2;
import java.util.Scanner;
public class Pr23 {
    public static void main(String[] args){
        Scanner val = new Scanner(System.in);
        int N = val.nextInt();
        int number1 = val.nextInt();
        int number2 = val.nextInt();
        int count = 0;
        for(int x = 1; x <= N;x++){
            if(x % number1 == 0||x % number2 == 0){
                count += x;
            }
        }
        System.out.println(count);
    }
}
