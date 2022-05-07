import java.util.Arrays;

public class Test4 {
    public static void Bubble_Sort(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            boolean flg = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    flg = true;
                }
            }
            if (flg == false){
                    return;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {7,4,6,2,1,3,5,9,8};
        Bubble_Sort(array);
        System.out.println(Arrays.toString(array));
    }
}
