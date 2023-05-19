package Semestr2;
import java.util.Arrays;
public class Pr18 {
    public static void main(String[] args){
        int[] array0 = new int[] {1,4,3,21,6,12,14};
        int[] array1 = leftArray(array0);
        int[] array2 = rightArray(array0);
        System.out.println(Arrays.toString(array1) + "\n" + Arrays.toString(array2));
    }
    public static int[] leftArray(int[] array){
        for(int x = 0; x < array.length; x++){
            if(array[x] == Arrays.stream(array).max().getAsInt()){
                array = Arrays.copyOf(array,x);
            }
        }
        return array;
    }
    public static int[] rightArray(int[] arr){
        int idx = -1;
        for (int x = 0; x < arr.length; x++) {
            if(arr[x] == Arrays.stream(arr).max().getAsInt()){
                idx = x;
            }
        }
        int[] y = Arrays.copyOfRange(arr, idx+1, arr.length);
        return y;
    }
}
