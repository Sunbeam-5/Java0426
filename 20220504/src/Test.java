import java.util.Arrays;

public class Test {
    public  static  void  transform(int[] array1){
        for (int i = 0; i < array1.length; i++) {
            array1[i] *= 2;
        }
    }
    public static void main(String[] args) {
        int[] array= new int[]{1, 2, 3};
        transform(array);
        System.out.println(Arrays.toString(array));
    }
}
