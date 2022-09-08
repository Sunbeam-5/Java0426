package demo;

public class Hello {
    public static void main(String[] args) {
        System.out.println("你好。，欢迎学习Java");
        A a = new A();
        a.fA();
    }
    static class A{
        void fA(){
            System.out.println("We are students");
        }
    }
}
