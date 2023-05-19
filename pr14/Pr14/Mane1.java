package Semestr2.Pr14;
import java.util.Arrays;
import java.util.Scanner;
public class Mane1 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Введите количество ячеек");
        int size = x.nextInt();
        Pr14 array = new Pr14(size);
        System.out.println("Все ячейки заполнены");
        while(true){
            System.out.println(Arrays.deepToString(array.array1()));
        }
    }
}
