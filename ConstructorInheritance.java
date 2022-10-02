


public class ConstructorInheritance {
    public static void main(String[] args) {
//        Derived dr = new Derived(1,2);
        ChildDerived cd = new ChildDerived(1,2,3);

    }
}

class Base{
    Base(){
        System.out.println("Base Class Constructor ");
    }
    Base(int x){
        System.out.println("Base Class Constructor with argument as  "+ x);
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("Derived Class Constructor ");
    }
    Derived(int a,int b){
        super(a);
        System.out.println("Derived Class Constructor with argument as  "+ b);

    }
}

class ChildDerived extends Derived{
    ChildDerived(){
        System.out.println("Child Derived Class Constructor ");
    }
    ChildDerived(int p, int q , int r){
        super(p,q);
        System.out.println("ChildDerived Class Constructor with argument as  "+ r);
    }
}
