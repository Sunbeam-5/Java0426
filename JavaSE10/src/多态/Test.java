package 多态;

class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void  eat(){
        System.out.println(name + "正在吃饭");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }
    public void bark(){
        System.out.println(getName()+"汪汪汪！");
    }
}
class Bird extends Animal{
    public String wing;
    public Bird(String name, int age) {
        super(name, age);
    }
    public void fly(){
        System.out.println(getName()+"正在飞");
    }
    public void eat(){
        System.out.println(getName()+"要吃鸟粮");
    }
}

public class Test {
    public static void main(String[] args) {
        /*Bird bird = new Bird("鹦鹉", 2);
        Animal animal = bird;*/
        //上下两段相等
        Animal animal = new Bird("鹦鹉", 2);//向上转型
        /*animal.fly();*///只能引用Animal里面的方法
        /*animal.wing;*///只能调用自己特有的方法，不可以调用子类的方法
        animal.eat();//动态绑定
    }

    public static void main1(String[] args) {
        Bird bird = new Bird("鹦鹉",2);
        bird.fly();
        bird.eat();

    }
}
