public class DynamicMethodDispatching {
    public static void main(String[] args) {
//        Phone ph = new Phone();
//        smartPhone spm = new smartPhone();
        Phone sa = new smartPhone();
        sa.on();
        sa.greet();

    }
}

class Phone{
    public void greet(){
        System.out.println("You are welcome here !");
    }
    public void on(){
        System.out.println("Turning the phone on...");
    }
}
class smartPhone extends Phone{
    public void swagat(){
        System.out.println("Aapka Swagat hai!!");
    }
    public void on(){
        System.out.println("Turning on the SmartPhone...");
    }
}