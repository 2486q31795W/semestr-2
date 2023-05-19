package Semestr2.Pr14;
import java.util.Arrays;
import java.util.Scanner;
public class Pr14 {
    private int[][] array;

    public Pr14(int size) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите элементы ячеек");
        array = new int[size][3];
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < 3; y++) {
                array[x][y] = scan.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    public int[][] array1(){
        Scanner scan = new Scanner(System.in);


        int number = scan.nextInt();
        int min = Integer.MAX_VALUE;
        int minI = -1;
        int minJ = -1;
        for(int x = 0; x < array.length;x++){
            for(int y = 0; y < 3;y++){
                if(array[x][y] < min){
                    min = array[x][y];
                    minI = x;
                    minJ = y;

                }

            }

        }
        array[minI][minJ] = number;
        return array;

    }
}
