public class MethodOOvereiding {
    public static void main(String[] args) {
        A1 a = new A1();
        a.methd2();
        B b = new B();
        b.methd2();
    }
}

class A1{
    public void methd2(){
        System.out.println("I m method of classA");
    }
}
class B extends A1{
    @Override
    public void methd2(){
        System.out.println("I m method of class B");
    }
}
