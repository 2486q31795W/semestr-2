package Semestr2;
import java.util.Scanner;
public class Pr21 {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        String num = number.nextLine();
        String[] arrayStr = num.split("");
        String str = "";
        for(int x = 0; x < arrayStr.length; x++){
            int val = Integer.parseInt(arrayStr[x]);
            if(arrayStr[x].equals("1")||arrayStr[x].equals("2")||arrayStr[x].equals("3")) {
                val += 6;
                str += val;
            }
            if(arrayStr[x].equals("4")||arrayStr[x].equals("5")||arrayStr[x].equals("6")||arrayStr[x].equals("0")){
                str += val;
            }
            if(arrayStr[x].equals("7")||arrayStr[x].equals("8")||arrayStr[x].equals("9")){
                val -= 6;
                str += val;
            }
        }
        System.out.println(str);
    }
}
