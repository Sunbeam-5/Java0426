import java.util.Scanner;

public class 打印X图形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        for (int i = 0; i < n / 2 + 1; i++) {


            for (int j = 1; j <= m; j++) {
                if (j == 1) {
                    System.out.print("*");
                } else if (j == m) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            m -= 2;
            System.out.println();

        }
    }
}
