import java.util.Scanner;

public class 判定素数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        for (i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0){
                break;
            }
        }
        if (i > Math.sqrt(n) && n != 1){
            System.out.println(n+"是素数");
        }else{
            System.out.println(n+"不是素数");
        }
    }
}
