interface test{
    void square();
}
class arithmetic implements test{
    public void square(){
        System.out.println("Function named square");
    }
}
public class Exp5que1 {
    public static void main(String[] args) {
        arithmetic a = new arithmetic();
        a.square();
    }
}
