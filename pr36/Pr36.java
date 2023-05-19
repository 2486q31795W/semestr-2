package Semestr2;
import java.util.Scanner;
public class Pr36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] code = new int[4];
        for(int x = 0; x < 4; ++x) {
            code[x] = (int) (Math.random() * 10);
        }
        for(int y = 0; y < 20; y++) {
            int[] user_code = new int[4];
            int count = 0;
            for(int x = 0; x < 4; ++x) {
                user_code[x] = scanner.nextInt();
                if (user_code[x] == code[x]) {
                    count++;
                }
            }
            if(count == 4) {
                System.out.print("Код верный");
                return;
            }
            System.out.print("Кол-во совпадений: " + count);
        }
    }
}
