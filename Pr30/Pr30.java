package Semestr2;
import java.util.*;
public class Pr30 {
    private static final Deque<Integer> indexes = new LinkedList<>();
    private static final List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] ts = {50, 55, 56, 57, 60};
        int num = 163;
        int summ = choose_best_sum(num,3, ts);
        if(Collections.min(list) < num){
            System.out.println(summ);
        }
    }

    public static int choose_best_sum(int num, int expectedSize, int[] arr) {
        int summ = 0;
        if (indexes.size() == expectedSize) {

            for (Integer x : indexes) {
                summ +=arr[x];
            }
            if(num <= summ) {
                summ = num;
                list.add(summ);
            }
            list.add(summ);
        }
        for (int x = 0; x < arr.length; x++) {
            if (!indexes.contains(x)) {
                indexes.addLast(x);
                choose_best_sum(num, expectedSize,arr);
                indexes.removeLast();
            }
        }
        return Collections.max(list);
    }
}
