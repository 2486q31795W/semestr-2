package Semestr2;
import java.util.ArrayList;
import java.util.Scanner;
public class Pr37 {
    private static final ArrayList<Integer> num_players = new ArrayList<>();
    private static final ArrayList<Integer> retired = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q;
        int start;
        System.out.println("Кол-во игроков: " + (q = scanner.nextInt()) + "\n" + "Номер игрока: "
                + (start = scanner.nextInt() - 1 ));
        for (int x = 1; x <= q; x++) {
            num_players.add(x);
        }
        for(int y = 1; y < num_players.size() + 1; y++) {
            start = element_index(start);
        }
        System.out.println(retired.toString());
    }
    public static int element_index(int delete_x) {
        if (delete_x >= num_players.size()) {
            while (delete_x >=  num_players.size()) {
                delete_x -= num_players.size();
            }
        }
        retired.add(num_players.get(delete_x));
        num_players.remove(delete_x);
        return delete_x + 2;
    }
}
