public class Girlfriend {
    static class GirlFriend{
        public String name;
        public int age;
        public int weight;
        public int height;
        public String number;
        public String address;

        public void a(){
            System.out.println(name+":早安，小狐狸");
        }
        public void b(){
            System.out.println(name+":午安");
        }
        public void c(){
            System.out.println(name+":晚安");
        }
        public void d(){
            System.out.println(name+":去吧，皮卡丘");
        }
        public void e(){
            System.out.println(name+":啊哈哈哈，憨憨");
        }
        public void f(){
            System.out.println(name+":pog fish");
        }
        public void g(){
            System.out.println(name+":키스");
        }
    }
    public static void main(String[] args) {
        GirlFriend A = new GirlFriend();
        A.name = "Isbella";
        A.age = 19;
        A.weight = 103;
        A.height = 168;
        A.number = "626377XX";
        A.address = "LA";
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.weight);
        System.out.println(A.height);
        System.out.println(A.number);
        System.out.println(A.address);
        A.a();
        A.b();
        A.c();
        A.d();
        A.e();
        A.f();
        A.g();
    }
}
