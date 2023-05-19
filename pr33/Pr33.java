package Semestr2;
import java.util.Scanner;
public class Pr33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long tanyaSticks = playGame(x, true);
        System.out.println(tanyaSticks);
    }
    private static long playGame(long sticks, boolean tanyaTurn) {
        if (sticks == 1) {
            return tanyaTurn ? 0 : 1;
        }
        if (sticks % 2 == 0) {
            if (tanyaTurn) {
                return playGame(sticks / 2, !tanyaTurn);
            } else {
                if (sticks == 2) {
                    return 1;
                } else {
                    return Math.max(playGame(sticks - 1, !tanyaTurn), playGame(sticks / 2, !tanyaTurn));
                }
            }
        } else {
            return playGame(sticks - 1, !tanyaTurn);
        }
    }
}
