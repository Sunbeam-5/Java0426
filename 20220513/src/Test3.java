import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dest = sc.next();
        String str1 = sc.nextLine();
        String str = sc.nextLine();
        int index = str.lastIndexOf(dest);
        if (index == -1)
            System.out.println("Not Found");
        else
            System.out.println("index ="+" "+index);
    }
}
