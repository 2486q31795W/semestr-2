package Semestr2;
import java.util.Scanner;
public class Pr32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        boolean sashaTurn = true;
        while (x > 1) {
            if (x % 2 == 0) {
                if (sashaTurn) {
                    x = x / 2;
                } else {
                    x = x - 1;
                }
            } else {
                x = x - 1;
            }
            sashaTurn = !sashaTurn;
        }
        if (sashaTurn) {
            System.out.println("Таня");
        } else {
            System.out.println("Саша");
        }
    }
}
