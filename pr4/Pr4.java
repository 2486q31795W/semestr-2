package Semestr2;

public class Pr4 {
    public static void main(String[] args){
        int count = str_count("Hello", 'o');
        int count1 = str_count("Hello", 'l');
        int count2 = str_count("", 'z');
        System.out.println(count + "\n" + count1 + "\n" + count2);
    }
    public static int str_count(String str, char letter){
        int count = 0;
        for(int x = 0; x < str.length(); x++){
            char l = str.charAt(x);
            if(l == letter) {
                count++;
            }
        }
        return count;
    }

}
