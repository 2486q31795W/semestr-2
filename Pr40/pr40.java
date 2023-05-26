package Semestr2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class pr40 {
    public static void main(String[] args){
        Random rnd = new Random();
        int N = rnd.nextInt(20);
        ArrayList<Integer> arrayList = new ArrayList<>(rnd.nextInt(20));
        while (arrayList.size() < N) {
            int i = rnd.nextInt(60) - 30;
            if (!arrayList.contains(i)) {
                arrayList.add(i);
            }
        }
        int[] randomArray = arrayList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray) + "\n" + row_ranges(randomArray));
    }
    static String row_ranges(int[] array) {
        StringBuilder stringBox = new StringBuilder();
        int min = array[0];
        int max = array[0];
        for (int x : array){
            if ( max == x ){
                continue;
            }
            if(Math.abs(max-x) > 1){
                if(stringBox.length() > 1){
                    stringBox.append(",");
                }
                stringBox.append(max == min ? min : min + "-" + max);
                min = x;
                max = x;
            } else{
                max = x;
            }

        }

        if (stringBox.length() > 1){
            stringBox.append(",");
        }

        stringBox.append(max == min ? min : min + "-"+max);

        return stringBox.toString();
    }
}
