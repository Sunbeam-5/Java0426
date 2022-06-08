class Girlfriend{
    public String name;
    public String Englishname;
    public int age;
    public int height;
    public int weight;
    public String number;
    public String address;

    public void responde1(){
        System.out.println(name+":"+"早安");
    }
    public void responde2(){
        System.out.println(name+":"+"午安");
    }
    public void responde3(){
        System.out.println(name+":"+"晚安");
    }
    public void responde4(){
        System.out.println(name+":"+"啊哈哈哈哈哈哈，憨憨");
    }
    public void responde5(){
        System.out.println(name+":"+"小狐狸~");
    }
    public void responde6(){
        System.out.println(name+":"+"憨批");
    }
}
public class 自己造一个对象 {
    public static void main(String[] args) {
        Girlfriend the_little_prince = new Girlfriend();
        the_little_prince.name = "w";
        the_little_prince.Englishname = "Isbella";
        the_little_prince.age = 19;
        the_little_prince.height = 168;
        the_little_prince.weight = 103;
        the_little_prince.number = "626362xxxx";
        the_little_prince.address = "Ontario, CA";

      /*  System.out.println(the_little_prince.name);
        System.out.println(the_little_prince.Englishname);
        System.out.println(the_little_prince.age);
        System.out.println(the_little_prince.height);
        System.out.println(the_little_prince.weight);
        System.out.println(the_little_prince.number);
        System.out.println(the_little_prince.address); */
        the_little_prince.responde3();
    }
}
