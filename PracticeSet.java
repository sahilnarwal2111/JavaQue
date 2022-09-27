public class PracticeSet {
    public static void main(String[] args) {
//        circle cir = new circle(23);
//        System.out.println(cir.area());
//        cylinder cy = new cylinder(12,23);
//        System.out.println(cy.volume());
//        Rectangle01 rec = new Rectangle01(2,4);
//        System.out.println(rec.area());
        Cuboid cub = new Cuboid(1,2,3);
        System.out.println(cub.vol());
    }
}
class circle {
    public int radius;
    public circle() {
        this.radius = radius;
        System.out.println("I m the constructor of circle class");
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }

    public void perimeter() {
    }
}
class cylinder extends circle{
    public int height;
    public cylinder(int radius, int height) {
        super();
        this.height = height;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

class Rectangle01{
    public int length,breadth;

    public Rectangle01(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("I m the constructor of Rectangle01 class");
    }
    public float area(){
        return this.length*this.breadth;
    }
}

class Cuboid extends Rectangle01{
    public int height;
    public Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }
    public float vol(){
        return this.length*this.breadth*this.height;
    }
}
