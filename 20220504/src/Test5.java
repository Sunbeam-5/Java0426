public class Test5 {
    public static boolean judge(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return false;
        }
        return  true;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,8,7};
        boolean flg = judge(array);
        if (flg)
            System.out.println("有序");
        else
            System.out.println("无序");
    }
}
