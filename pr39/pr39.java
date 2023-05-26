package Semestr2;
import java.util.Scanner;
public class pr39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(maxNum(num) > num){
            System.out.println(maxNum(num));
        } else {
            System.out.println(-1);
        }
    }
    public static int maxNum(int num){
        int[] arr = new int[10];
        String str = Integer.toString(num);
        for(int x= 0; x < str.length();x++){
            arr[str.charAt(x)-'0']++;

        }
        int max = 0;
        int composition = 1;
        for (int y = 0; y < 10; y++){
            while (arr[y] > 0) {
                max = max + (y * composition);
                arr[y]--;
                composition = composition * 10;
            }

        }
        return max;
    }
}
