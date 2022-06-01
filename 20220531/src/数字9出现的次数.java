public class 数字9出现的次数 {
    public static void test() {
        int sum = 100 ; // 最大的范围
        int num = 9 ; // 被统计的数字
        int count = 0 ; //计数
        for (int i = 0; i < sum; i++) {
            String s = String.valueOf(i);
            char[] charArray = s.toCharArray(); // 转为char数组
            for (char c : charArray) {
                // 开始逐个比较
                if(String.valueOf(c).equals(String.valueOf(num))) {
                    count ++ ;
                    System.out.println("数字是："+ s);
                }
            }
        }
        System.out.println("统计9的个数 count="+ count);
    }

    public static void main(String[] args) {
        test();
    }
}
