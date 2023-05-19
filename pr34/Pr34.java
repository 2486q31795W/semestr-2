package Semestr2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
public class Pr34 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int num;
        String[] z = new String[9];
        for(int x = 0; x < z.length; x++) {
            num = rnd.nextInt(55,180);
            z[x] = "" + num;
            System.out.print(z[x] + " ");
        }
        System.out.println("\n");
        Arrays.sort(z, Comparator.comparingInt(Pr34::sum_of_digits));
        for(String i: z){
            System.out.print(i + " ");
        }
    }
    public static int sum_of_digits(String numbers) {
        int sum = 0;
        for(int x = 0; x < numbers.length(); ++x) {
            sum += Character.getNumericValue(numbers.charAt(x));
        }
        return sum;
    }
}
