import java.util.Scanner;

public class 模拟登陆 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String str1 = sc.nextLine();
            String str2 = "Isbella";
            if (str1.equals(str2)){
                System.out.println("登录成功");
                break;
            }
            else{
                System.out.println("密码错误");
            }
        }


    }
}
