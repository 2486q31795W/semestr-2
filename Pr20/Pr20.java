package Semestr2;

public class Pr20 {
    public static void main(String[] args) {
        int[][] creat = matrix(5, 5);
        print(creat);
    }

    public static int[][] matrix(int m, int height){
        int[][] array = new int[m][height];
        int val = 2;
        int row = 1, col = 1;
        for(int x = 0; x < array.length; x++){
            for(int y = 0; y < array[x].length; y++){
                array[0][y] = 1;
                array[array.length - 1][y] = 1;
                array[x][0] = 1;
                array[x][array[x].length - 1] = 1;
            }
        }
        while (row < m && col < height) {

            for (int x = col; x < height - 1; x++) {
                array[row][x] = val++;
            }
            row++;

            for (int x = row; x < m - 1; x++) {
                array[x][height - 2] = val++;
            }
            height--;

            if (row < m - 1) {
                for (int x = height - 2; x >= col; x--) {
                    array[m - 2][x] = val++;
                }
                m--;
            }

            if (col < height - 1) {
                for (int x = m - 2; x >= row; x--) {
                    array[x][col] = val++;
                }
                col++;
            }
        }
        return array;

    }
    public static void print(int[][] arr){
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.printf("%4d\t", arr[x][y]);
            }
            System.out.println();
        }


    }
}
