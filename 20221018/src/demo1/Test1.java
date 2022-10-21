package demo1;

class Person{
    String name = "no name";
    public Person(String nm){
        name = nm;
    }

    public Person() {

    }
}
class Employee extends Person{
    String empID = "0000";
    public Employee(String id){
        super();
        empID = id;
    }
}
public class Test1 {
    public static void main(String[] args) {
        Employee e = new Employee("123");
        System.out.println(e.empID);
    }
}
