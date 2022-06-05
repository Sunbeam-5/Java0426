public class 求最大值方法的重载 {
    public static void main(String[] args) {
        int a = 90003, b = 510000;
        double x = 3.2, y = 6.4;
        System.out.println(judge(a,b));
        System.out.println(judge(x,y));
        System.out.println(judge(a,x));
    }
    public static int judge(int m, int n){
        if (m > n){
            return m;
        }else {
            return n;
        }
    }
    public static double judge(double m, double n){
        if (m > n){
            return m;
        }else{
            return n;
        }
    }
    public static double judge(int m, double n){
        if (m > n){
            return m;
        }else{
            return n;
        }
    }
}
