import java.util.Scanner;

public class 选择排序法 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 5, 4, 3, 2, 1 };
        int index = 0, temp = 0, min = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min){
                    index = j;
                    min = arr[j];
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println(arr);
    }
}
