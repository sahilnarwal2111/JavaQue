public class PracticeOOPsJava {
    public static void main(String[] args) {
        /*
        //Problem 1
        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        //Problem 2
        CellPhone Apple = new CellPhone();
        Apple.ringing();
        Apple.vibrating();


        //Problem 3
        Square sq = new Square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.peri());


        //Problem 4
        Rectangle rec = new Rectangle();
        rec.length = 2;
        rec.breadth = 4;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());

         */

//        //Problem 5
//        Tommy tom = new Tommy();
//        tom.firing();
//        tom.running();
//        tom.hitting();

//        Problem 6
        circle cir = new circle();
        cir.radius=2;
        cir.area();
        cir.perimeter();


    }
}
class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class CellPhone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int peri(){
        return 4*side;
    }
}
class Rectangle{
    int length, breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

class Tommy{
    public void hitting(){
        System.out.println("Hitting the enemy");
    }
    public void running(){
        System.out.println("running from enemy");
    }
    public void firing(){
        System.out.println("firing the enemy");
    }
}
class Circle{
    int radius;
    public void area(){
        System.out.format("Area is %f\n",radius*radius*3.14f);
    }
    public void perimeter(){
        System.out.format("Perimeter is %f\n",2*radius*3.14f);
    }
}