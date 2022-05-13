import java.io.IOException;
import java.util.Scanner;
/*
it is so 666 really 6666 what else can I say 6666666666
it is so 666 really 9 what else can I say 27
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.replaceAll("6{9}6+", "27");
        str = str.replaceAll("6{3}6+", "9");
        System.out.println(str);
    }

}