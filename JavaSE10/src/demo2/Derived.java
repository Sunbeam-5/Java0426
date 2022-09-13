package demo2;

class Base{
    public Base(){
        System.out.print("B");
    }
}

public class Derived extends Base{
    public Derived (String s) {
        super();
        System.out.print("D");
    }
    public static void main(String[] args){
        new Derived("C");
    }
}