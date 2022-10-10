//21030611052 张昊
package demo1;

public class American extends People{
    public void americanBoxing(){
        System.out.println("直拳，勾拳，组合拳");
    }
    public void speakHello(){
        System.out.println("How do you do");
    }
    public void averageHeight(){
        height = 176;
        System.out.println("American's average height:"+height +"cm");
    }
    public void averagerWeight(){
        weight = 75;
        System.out.println("American's average weight:"+weight+"kg");
    }
}
