package Semestr2;
import java.util.Scanner;
public class Pr29 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String num1 = scan.nextLine();
        int num1_int = Integer.parseInt(num1.trim());
        int num2 = scan.nextInt() - 1;
        int summ = 0;
        String[] nums = num1.split("");
        for(int x = 0; x < nums.length; x++){
            num2++;
            int n = Integer.parseInt(nums[x].trim ());
            summ += Math.pow(n,num2);
        }
        if(summ % num1_int == 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
