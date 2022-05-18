import java.util.*;
public class 打死我也不说 {
    static int N,M;
    static String[][] array;
    static int[][] location = new int[2][2];//记录D和S的位置
    //如果不区分大小写，则将sta设为二维数组，第二列存放dswybs
    static String[] sta = new String[6];//存放字符串DSWYBS
    static boolean flag = false;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sta[0] = "D";
        sta[1] = "S";
        sta[2] = "W";
        sta[3]= "Y";
        sta[4] = "B";
        sta[5] = "S";
        M = sc.nextInt();
        N = sc.nextInt();
        //nextInt()只读取数值，剩下"\n"还没有读取，nextLine()会读取"\n"，并结束
        sc.nextLine();//读取回车，否则将被数组读取造成每行最后一个没有的现象
        array = new String[M][N];
        for(int i=0;i<M;i++){
            String tmp = sc.nextLine();
            //array[i] = tmp.split("");不能这么用，每行最后一个字符会读不到
            for(int j=0;j<N;j++){
                array[i][j]=String.valueOf(tmp.charAt(j));
            }
        }
        for(int i=0;i<M;i++)
            for(int j=0;j<N;j++) {
                if("D".equals(array[i][j])) {//找到D
                    try {
                        recursion(i, j ,1);//利用递归去确定字符串DSWYBS,到S后将flag置为true,1代表第一个字符D
                    }catch(Exception e) {}
                    if(flag == true) {
                        location[0][0] = i;
                        location[0][1] = j;
                        break;
                    }
                }
            }
        if(flag) {
            int Sum = location[0][0] + location[0][1] + location[1][0] +location[1][1];
            System.out.println(location[0][0]+" "+location[0][1]);
            System.out.println(location[1][0]+" "+location[1][1]);
            System.out.println(Sum);
        }
        else {
            System.out.println("DSWYBS");
        }
    }
    public static void recursion(int x, int y, int n) throws Exception {//判断D点的周围一圈的点，递归搜索
        if(n!=6) {
            if(x>=1 && y>=1) {
                if(array[x-1][y-1].equals(sta[n]))//等于下一个字符就在递归搜索下一个字符（n+1）
                    recursion(x-1, y-1, n+1);
            }
            if(x>=1){
                if(array[x-1][y].equals(sta[n]))
                    recursion(x-1, y, n+1);
            }
            if(x>=1 && y+1<N) {
                if(array[x-1][y+1].equals(sta[n]))
                    recursion(x-1, y+1, n+1);
            }
            if(y>1){
                if(array[x][y-1].equals(sta[n]))
                    recursion(x, y-1, n+1);
            }
            if(y+1<N){
                if(array[x][y+1].equals(sta[n]))
                    recursion(x, y+1, n+1);
            }
            if(x+1<M && y>=1) {
                if(array[x+1][y-1].equals(sta[n]))
                    recursion(x+1, y-1, n+1);
            }
            if(x+1<M) {
                if(array[x+1][y].equals(sta[n]))
                    recursion(x+1, y, n+1);
            }
            if(x+1<M && y+1<N) {
                if(array[x+1][y+1].equals(sta[n]))
                    recursion(x+1, y+1, n+1);
            }
        }
        else {
            location[1][0] = x;
            location[1][1] = y;
            flag = true;
            throw new Exception();
        }
    }
}