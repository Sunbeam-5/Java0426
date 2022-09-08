import java.util.Scanner;
public class 字符集合 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str1=scanner.nextLine();
            if(str1==null && str1.length()>100){
                return;
            }
            String str2=String.valueOf(str1.charAt(0));
            for (int i = 0; i < str1.length(); i++) {
                if(!str2.contains(String.valueOf(str1.charAt(i)))){
                    str2 += str1.charAt(i);
                }
            }
            System.out.println(str2);
        }
        scanner.close();
    }
}