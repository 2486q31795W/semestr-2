package Semestr2;
import java.util.Scanner;
public class Pr3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float triangle[][] = new float[3][2];
        int n = 1;
        for(int x = 0; x < 3; x++){
            System.out.println("Введите координаты " + n + "й вершины треугольника");
            n++;
            for(int y = 0; y < 2; y++){
                triangle[x][y] = in.nextInt();
            }
        }
        System.out.println("Барицентр треугольника EDF=>" + "{"
                + (triangle[0][0] + triangle[1][0] + triangle[2][0])/3 + ","
                + (triangle[0][1] + triangle[1][1] + triangle[2][1])/3 + "}");
    }
}
