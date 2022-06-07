public class 自己造一个对象 {
    class girlfriend{
        public String name;
        public String Englishname;
        public int age;
        public int height;
        public int weight;
        public String number;
        public String address;

        public void responde1(){
            System.out.println("早安");
        }
        public void responde2(){
            System.out.println("午安");
        }
        public void responde3(){
            System.out.println("晚安");
        }
        public void responde4(){
            System.out.println("啊哈哈哈哈哈哈，憨憨");
        }
        public void responde5(){
            System.out.println("小狐狸~");
        }
        public void responde6(){
            System.out.println("憨批");
        }
    }
    public static void main(String[] args) {
        girlfriend the_little_prince = new girlfriend();
        the_little_prince.name = "绾";
        the_little_prince.Englishname = "Isbella";
        the_little_prince.age = 19;
        the_little_prince.height = 168;
        the_little_prince.weight = 103;
        the_little_prince.number = "62";
        the_little_prince.address = "CA";

        the_little_prince.responde1();
    }
}
