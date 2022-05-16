import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];

        for (int k = 0; k < str.length; k++) {
            str[k] = sc.next();
        }
        for(i=0;i<str.length;++i) {
            for(j=0;j<(str.length-i-1);++j) {
                if(str[j].compareTo(str[j+1])>0) {
                    String temp;
                    temp=str[j+1];
                    str[j+1]=str[j];
                    str[j]=temp;
                }
            }
        }
        System.out.println("After sorted:");
        for(i=0;i<str.length;++i)
            System.out.println(str[i]);
    }

}
