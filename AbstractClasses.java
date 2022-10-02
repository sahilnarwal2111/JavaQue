public class AbstractClasses {
    public static void main(String[] args) {

        
        
        
    }
}
abstract class Parent2{
    public void hello(){
        System.out.println("Hello world!!");
    }
    abstract void greet();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Hello There!");
    }
}
abstract class Child02 extends Parent2{
    public void Hello1(){
        System.out.println("Hello");
    }
}

