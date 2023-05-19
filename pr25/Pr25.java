package Semestr2;
import java.util.*;
public class Pr25 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        String m = number.nextLine();
        String[] num = m.split(" ");
        int summ = 0;
        int y = 0;
        int y1 = 0;
        for(int z = 0; z < num.length; z++){
            y = Integer.parseInt(num[0]);
            y1 = Integer.parseInt(num[1]);
        }
        for(int x1 = y; x1 <= y1; x1++){
            ArrayList<String> AL = new ArrayList();
            ArrayList<String> AL2 = new ArrayList();
            for(int z = 2; z < num.length; z++){
                AL2.add(num[z]);
                int x = Integer.parseInt(num[z].trim());
                if(x1 % x == 0){
                    String str = "" + x;
                    AL.add(str);
                }
            }
            if(AL.equals(AL2)){
                summ += x1;
            }
        }
        System.out.println(summ);
    }
}
