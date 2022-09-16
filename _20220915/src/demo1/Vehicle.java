package demo1;

public class Vehicle {
    double speed = 0;
    int power;
    double maxSpeed = 0.0;
    String name;
    static double minSpeed = 0.0;
    public static void showMinSpeed(){
        System.out.println(minSpeed);
    }
    Vehicle() {
        speed = 0;
    }
    Vehicle(String name){
        if (name == "bike"){
            power = 10;
            maxSpeed = 25;
        }
        if (name == "plane"){
            power = 200;
            maxSpeed = 600;
        }
        if (name == "car"){
            power = 50;
            maxSpeed = 200;
        }
    }
    Vehicle(String name, int speed, int maxSpeed, int power){
       this.name = name;
       this.speed = speed;
       this.maxSpeed = maxSpeed;
       this.power = power;
    }
    public void speedUp(int s){
        if (speed + s <= 200) {
            speed = speed + s;
        }
    }
    public void speedDown(int d){
        /*if (speed - d > 0) {
            speed = speed - d;
        }*/
        speed = minSpeed;
    }
    public void  setPower(int p){
        power = p;
    }
    int getPower(){
        return power;
    }

    public double getSpeed() {
        return speed;
    }

    public void brake(){
        speed = 0;
    }

}
class Bike extends Vehicle{

}
class Car extends Vehicle{

}
class Plane extends Vehicle{

}

