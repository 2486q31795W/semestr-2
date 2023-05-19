package Semestr2;
import java.util.ArrayList;
import java.util.Scanner;
public class Pr28 {
    private static final ArrayList<Integer> list = new ArrayList();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextInt();
        if (0 < number && number < 100000) {
            for (int x = 1; x < number; x++) {
                list.add((int) Math.pow(x, 2));
            }
        }
        System.out.println(differenceVal(number));
    }
    public static String differenceVal(double num){
        for (int x = 0; x < list.size(); x++) {
            for (int y = 0; y < list.size(); y++) {
                if (list.get(x) - list.get(y) == num) {
                    return (int) num + "=" + list.get(x) + "-" + list.get(y);
                }
            }
        }
        return null;
    }
}
