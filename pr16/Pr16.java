package Semestr2;
import java.util.Scanner;
public class Pr16 {
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        String str1 = str.nextLine();
        String[] str2 = str1.split("");
        int y = 0;
        for(int x = 0; x <  str2.length;x++){
            if(str2[x].equals(str2[x].toUpperCase())) {
                y++;
            }
            if(y > str2.length - y) {
                str1 = str1.toUpperCase();

            } else {
                str1 = str1.toLowerCase();
            }
        }
        System.out.println(str1);
    }
}
