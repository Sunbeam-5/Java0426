import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

public class 斐波那契数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fibonacci(n));
    }
    public static int Fibonacci(int n){
        if (n == 1 || n == 2){
            return 1;
        }else{
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
