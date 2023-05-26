package Semestr2;
import java.util.HashSet;
public class pr48 {
    public static void main(String[] args) {
        int q = 30;
        HashSet<Integer> u = new HashSet<>();

        int x = 0;
        int y, z;

        while (u.size() < q) {
            y = 2 * x + 1;
            z = 3 * x + 1;
            u.add(x);
            u.add(y);
            u.add(z);
            x++;
        }

        System.out.println("Ряд чисел u без дубликатов:");
        for (int num : u) {
            System.out.print(num + " ");
        }
    }
}
