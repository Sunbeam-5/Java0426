public class 数字9出现的次数 {
    public static void main(String[] args) {
        int i = 0;
        for (int a = 1; a <= 100 ;a++) {
            if ((a / 10) == 9) {
                i++;
            }
            if ((a % 10) == 9) {
                i++;
            }
        }
        System.out.println(i);
    }
}

