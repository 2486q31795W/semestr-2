package Semestr2;
import java.util.Random;
public class Pr22 {
    public static void main(String[] args){
        Random rnd = new Random();
        int a = rnd.nextInt(9) + 1;
        int b = rnd.nextInt(9) + 1;
        int c = rnd.nextInt(9) + 1;
        if((a+b)>c && (b+c)>a && (a+c)>b){
            double square = square(a,b,c);
            System.out.println(square);
        }
    }
    public static double square(double a,double b,double c){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
