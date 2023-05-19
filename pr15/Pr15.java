package Semestr2;
import java.util.LinkedHashSet;
public class Pr15 {
    public static void main(String[] args){

        String str1 = line("abc abc ab abc ab acs acs");
        System.out.println(str1);


    }
    public static String line(String str1){
        String str="";
        String[] arr=str1.split(" ");

        LinkedHashSet<String> list = new LinkedHashSet<String>();
        for (int x = 0; x < arr.length; x++) {
            list.add(arr[x]);
        }
        for(String s:list){
            str=str+s+" ";
        }

        return str;

    }
}
