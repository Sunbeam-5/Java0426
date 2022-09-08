/*
public class Test {
    public int aMethod(){
       */
/* static *//*
 int i = 0;
        i++;
        return i;
    }
    public static void main(String args[]){
        Test test = new Test();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
}*/

/*
public class Test{

    private float f=1.0f;

    int m=12;

    static int n=1;

    public static void main(String args[]){

        Test t=new Test();
        // t.f = 3.0;
        // this.n;
        Test.m;
        // Test.n;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

}*/

public class Test{
    static int cnt = 6;
    static{
        cnt += 9;
    }

    public static void main(String[] args) {
        System.out.println();
    }

    public static void main1(String[] args){
        System.out.println("cnt = " + cnt);
    }
    static{
        cnt /=3;
    };
}
