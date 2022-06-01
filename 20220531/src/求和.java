public class 求和 {
    public static void main(String[] args) {
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= 99; i += 2) {
            sum1 += i;
        }
        System.out.println(sum1);
        for (int i = 0; i <= 100; i += 2) {
            sum2 += i;
        }
        System.out.println(sum2);
    }
}
