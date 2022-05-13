import java.util.Scanner;

public class Tset4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder ex = new StringBuilder(str);
        ex.reverse();
        System.out.println(ex);
    }
}
