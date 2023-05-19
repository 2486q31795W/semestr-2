package Semestr2;
import java.util.*;
public class Pr2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Для завершения введите значение отличное от 0 и 1");
        List<String> rab = new ArrayList<String>();
        var n = in.nextInt();
        int i = 0;
        if (n < 2) {
            if(n==1){
                i++;
                rab.add("true");
            } else {
                rab.add("false");
            }

        }
        while (n < 2){
            n = in.nextInt();
            if (n == 1){
                i++;
                rab.add("true");
            } else {
                rab.add("false");

            }
        }
        int index = rab.size() - 1;
        rab.remove(index);
        System.out.println(rab + "\n" + "Количество работников: " + i);

    }
}
