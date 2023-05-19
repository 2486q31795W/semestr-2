package Semestr2;

public class Pr19 {
    public static void main(String[] args){
        int count = function(67);
        System.out.println(count);
    }
    public static int function(int num){
        int counter = 0;
        if(num == 0){
            return 0;
        }
        if(num % 2 == 0){
            while(num % 2 == 0){
                num/=2;
            }
            if(num % 3 > 0){
                counter++;
                num-=2;
            }
        }
        if(num % 3 >= 0){
            while(num % 3 >= 0){
                counter++;
                num-=2;
            }
        }
        if(num == 1){
            counter++;
        }
        return counter;
    }
}
