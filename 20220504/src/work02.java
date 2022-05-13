

public class work02 {
    //用两种方式，实现需求：判断一个int[]数组，是否是一个升序的数组
    //提示:循环、递归
    public static void main(String[] args) {
        //创建一个数组：数组的数可以任意更改
        int []array=new int[]{1,2,3,6,4,5};
        String str="";//用字符串来记录有序无序
        if(judgeArrayOrderByAscending(array, array.length-1))
            str="有序";
        else
            str="无序";
        System.out.println("递归方式:"+str);//输出
        if(judgeArrayIsOrderByAcsending(array))
            str="有序";
        else
            str="无序";
        System.out.println("循环的方式:"+str);
    }
    //循环的方式
    public static boolean judgeArrayIsOrderByAcsending(int []array){
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1])//当有逆序的时候，说明非升序
                return false;
        }
        //如果认为所有数组元素都相同的情况下，
        return true;
    }
    //递归的方式
    public static boolean judgeArrayOrderByAscending(int []array,int num){
        if(num==0){
            //出口，当数组中只有一个数字的时候，必然有序
            return true;
        }else{
            return judgeArrayOrderByAscending(array,num-1)&&array[num-1]<=array[num];
        }
    }
}
