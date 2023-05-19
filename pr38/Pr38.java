package Semestr2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Pr38 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\beres\\Documents\\text1.txt");
        Scanner sc = new Scanner(file);
        String text_file = "";
        while (sc.hasNextLine()) {
            text_file += sc.nextLine();
        }
        String[] array = text_file.split(" ");
        String[] str1;
        for(int x = 0; x < array.length; x++){

            str1 = array[x].split("");
            array[x] += (str1[0] + "ауч");
            array[x] = array[x].substring(1);
        }
        for (String j: array){
            System.out.print(j + " ");
        }
    }
}

