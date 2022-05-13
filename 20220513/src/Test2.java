import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("6{9}6+","27");
        str = str.replaceAll("6{3}6+","9");

        System.out.println(str);
    }
}
