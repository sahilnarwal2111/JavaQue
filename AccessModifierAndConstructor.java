
public class AccessModifierAndConstructor {
    public static void main(String[] args) {
//        Employee1 harry = new Employee1();
//        harry.setName("CodeWithHarry");
//        System.out.println(harry.getName());
        
        Circle1 cir = new Circle1();
        cir.setRadius(4);
        System.out.println(cir.getArea());
        System.out.println(cir.getCircumfernce());
    }
}

class Employee1{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
class Circle1{
    private int radius;
    public void setRadius(int n){
        this.radius = n;
    }
    public float getArea(){
        return radius*radius*3.14f;
    }
    public float getCircumfernce(){
        return radius*2*3.14f;
    }

}
