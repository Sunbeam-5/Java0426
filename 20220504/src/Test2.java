import java.util.Arrays;

public class Test2 {
    public static void initialization(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }
    public static void main(String[] args) {
        int[] array = new int[100];
        initialization(array);
        System.out.println(Arrays.toString(array));
    }
}
