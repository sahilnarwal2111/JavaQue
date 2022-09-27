public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.haveEars();
        dog.haveEyes();
        dog.bark();
    }
}

class Animal{
    public void haveEars(){
        System.out.println("Animals have two ears!");
    }
    public void haveEyes(){
        System.out.println("Animals have two eyes!");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dogs do barking !");
    }
}
