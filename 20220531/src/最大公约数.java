import java.util.Scanner;

public class 最大公约数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int t = 1;
        while (t != 0){
            t = m % n;
            m = n;
            n = t;
        }
        System.out.println(m);
    }
}
