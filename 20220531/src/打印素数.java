public class 打印素数 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        for (i = 1; i < 100; i++) {
            for (j = 2; j < Math.sqrt(100); j++) {
                if (i % j == 0){
                    break;
                }
            }
            if (j > Math.sqrt(i) && i != 1){
                System.out.println(i);
            }

        }
    }
}
