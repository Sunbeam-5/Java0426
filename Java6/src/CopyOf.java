import java.util.Arrays;

public class CopyOf {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,1,1,1,1,1};
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        System.out.println(Arrays.toString(copy));
    }
}
