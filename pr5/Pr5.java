package Semestr2;
import java.util.Scanner;

public class Pr5 {
    public static void main(String[] args) {
        int[] list;
        String str;
        String[] str_new;
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        str_new = str.split(" ");
        list = new int[str_new.length];
        int y = 0;
        for (int x = 0; x < str_new.length; x++){

            list[x] =  Integer.parseInt(str_new[x]);
            int q = list[x] * list[x];
            y += q;
        }
        System.out.println(y);
    }

}
