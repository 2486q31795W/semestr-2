package Semestr2;
import java.util.Scanner;
public class Pr9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String str1 = x.nextLine();
        String str2 = x.nextLine();
        boolean str = str1.endsWith(str2);
        System.out.println(str);
    }
}
