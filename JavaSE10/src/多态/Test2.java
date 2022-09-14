package 多态;

class Shape{
    public void draw(){
        System.out.println("画图形");
    }
}
class Rect extends Shape{
    public void draw(){
        System.out.println("♦");
    }
}

class Cycle extends Shape{
    public void draw(){
        System.out.println("●");
    }
}
class Triangle extends Shape{
    public void draw(){
        System.out.println("△");
    }
}

class Flower extends Shape{
    public void draw(){
        System.out.println("❀");
    }
}
public class Test2 {

    public static void drawMap(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {
        Rect rect = new Rect();
        Cycle cycle = new Cycle();
        Triangle triangle = new Triangle();
        Flower flower = new Flower();
        drawMap(rect);
        drawMap(cycle);
        drawMap(triangle);
        drawMap(flower);
    }
}
