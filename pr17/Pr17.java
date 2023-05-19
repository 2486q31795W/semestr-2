package Semestr2;
import java.util.Deque;
import java.util.LinkedList;
public class Pr17 {
    public static void main(String[] args){
        boolean line = correctnost("((()))");
        System.out.println(line);

    }
    public static boolean correctnost(String str){
        while (str.contains("()")) {
            str = str.replaceAll("\\(\\)", "");
        }
        return (str.length() == 0);
    }
}
