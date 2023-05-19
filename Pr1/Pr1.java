package Semestr2;

import java.util.Random;
public class Pr1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int size1 = 2;
        int size2 = 4;

        int[][] matrix2 = new int[size1][size2];

        for (int x = 0; x < size2; x++) {
            for (int y = 0; y < size1; y++) {
                matrix2[y][x] = rnd.nextInt(10);
                System.out.print(matrix2[y][x] + " ");
            }
            System.out.println();
        }
    }

}
