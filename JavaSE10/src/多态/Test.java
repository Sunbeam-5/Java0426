package 多态;

class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        //eat();  也可以发生动态绑定，但是不要这样写代码
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
    //加上final表示这个方法不能被重写：密封方法
    public void  eat(){
        System.out.println(name + "正在吃饭(Animal)");
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

    public void eat(){
        System.out.println(getName()+"正在吃狗粮");
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
        Animal animal = new Animal("动物",10);
        Dog dog = new Dog("狗子",10);
    }

    public static void main7(String[] args) {
        Animal animal = new Animal("狗子",10);
        Bird bird = (Bird) animal;
    }
    public static void main6(String[] args) {
        Animal animal = new Dog("狗子",6);

        //animal是不是引用了Bird这个对象
        if (animal instanceof Bird){
            //不是所有的动物都是鸟
            Bird bird = (Bird) animal;
            bird.fly();
        }
    }

    public static void main5(String[] args) {
        Animal animal = new Bird("鹦鹉",2);
        if (animal instanceof Bird){
            Bird bird = (Bird) animal;//向下转型
            bird.fly();
        }

    }


    /*-----------类的调用者实现的----------*/
    public static void function(Animal animal){
        animal.eat();
    }

    public static void main4(String[] args) {
        function(new Bird("小鸟",1));
        function(new Dog("狗子",1));
    }




    public static Animal func(){
        return new Bird("鹦鹉", 2);//向上转型--方法的返回值
    }

    public static void main3(String[] args) {
        Bird bird = new Bird("鹦鹉", 2);//向上转型--方法的传参
        function(bird);
    }
    public static void main2(String[] args) {
        /*Bird bird = new Bird("鹦鹉", 2);
        Animal animal = bird;*/
        //上下两段相等
        Animal animal = new Bird("鹦鹉", 2);//向上转型--直接赋值
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
