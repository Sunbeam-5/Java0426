import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,7,9,11};
        int target = 20;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    int[] array = {i, j};
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }
}
