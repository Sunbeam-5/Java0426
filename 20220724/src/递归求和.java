public class 递归求和 {
    public static int func(int a) {
        if (a == 1) {
            return 1;
        } else {
           return (func(a - 1) + a);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int value = func(n);
        System.out.println(value);
    }
}
