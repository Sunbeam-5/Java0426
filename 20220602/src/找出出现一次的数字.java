import java.util.Scanner;

public class 找出出现一次的数字 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" "); //字符串以空格分割
        sc.close();

        int[] num = new int[str.length];

        for(int i=0;i<str.length;i++)
            num[i] = Integer.parseInt(String.valueOf(str[i]));//将字符串的数字保存到整型数组里

        for (int i = 0; i < num.length; i++) {
            int count = 1;
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j]){
                    count++;
                }
                if (i == j){
                    continue;
                }
            }
            if (count == 1){
                System.out.println(num[i]);
            }
        }
    }
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.substring(1, str.length()-1);//去掉键盘输入的字符串中的"["和"]"
        String[] s = str.split(",");//将字符串以","分割，转为一个字符串数组
        int[] arr = new int[s.length];//定义一个整形数组，准备用来存数据了
        for(int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(s[i]);//将字符串转为int类型数据存入整型数组中
        System.out.println(Find_Num_1(arr));//调方法
    }
    public static Integer Find_Num_1(int[] arr){

        for(int i = 0; i < arr.length; i++) {
            int count = 1;//计数器
            for(int j = 0; j < arr.length; j++) {
                if(i == j)
                    continue;//下标相等则直接进入下一次循环
                if(arr[i] == arr[j])
                    count++;//如果不同下标的数组元素相等，则计数器加1
            }
            if(count == 1)
                return arr[i];//返回只出现了一次的元素
        }
        return null;//找不到则返回null
    }
*/
}
