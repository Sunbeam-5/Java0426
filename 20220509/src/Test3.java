import java.util.Scanner;

class StringsSortingExample
{
    public static void main(String...s)
    {

        int n,i,j;
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[5];
        for (int k = 0; k < 5; k++) {
            String str[i] = scanner.nextLine();
        }


        System.out.println("Before Sorting:");
        for(i=0;i<str.length;++i)
            System.out.println(str[i]);

        for(i=0;i<str.length;++i)
        {
            for(j=0;j<(str.length-i-1);++j)
            {
                if(str[j].compareTo(str[j+1])>0)
                {
                    String temp;
                    temp=str[j+1];
                    str[j+1]=str[j];
                    str[j]=temp;
                }
            }
        }

        System.out.println("\nAfter Sorting:");
        for(i=0;i<str.length;++i)
            System.out.println(str[i]);
    }
}