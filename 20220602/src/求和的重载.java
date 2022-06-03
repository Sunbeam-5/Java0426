import java.util.Scanner;

public class 求和的重载 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        double x = 6.4, y = 3.2, z = 5.2;
        int sum1 = add(a,b);
        double sum2 = add(x,y,z);
        System.out.println(sum1);
        System.out.println(sum2);
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b, double c){
        return a+b+c;
    }
}
