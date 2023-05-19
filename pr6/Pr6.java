package Semestr2;
import java.util.Scanner;
public class Pr6 {
    public static void main(String[] args){
        boolean value = number(123);
        System.out.println(value);

    }
    public static boolean number(int x){
        int y = 2;
        while (x % y != 0){
            y++;
        }
        if (y == x){
            return true;
        }
        return false;
    }

}
