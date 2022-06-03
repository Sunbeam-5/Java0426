/**
 大小写转换
 **/
import java.util.Scanner;

class TestChange
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println(changeStr(str1));
    }

    public static String changeStr(String str){

        char[] c = str.toCharArray();  //先将字符串转换成字符数组
        int value = 'a'-'A';  //计算大小写间差值：32

        //循环遍历字符数组
        for(int i = 0; i < c.length; i++){
            if('a'<=c[i] && c[i] <='z'){
                c[i] = (char)(c[i]-value);      //小写变大写
            }else if('A'<=c[i] && c[i] <='Z'){
                c[i] = (char)(c[i]+value);      //大写变小写
            }
        }

        String laststr = new String(c);  //再将字符数组转换成字符串
        return laststr;
    }
}