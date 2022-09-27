public class Practice_set_AbstractClasses_Interfaces {
    public static void main(String[] args) {
//        Monkey m1 = new Human();
//        m1.bite();
//        m1.jump();
//        TelePhone tp = new SmartTelePhone();
//        tp.ring();
//        tp.lift();
//        tp.disconnect();
//        tp.camera();
        TV tv = new TV();
        tv.volumeDown();
        tv.volumeUp();

    }
}
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    @Override
    public void write(){
        System.out.println("Writing...");
    }
    @Override
    public void refill(){
        System.out.println("Refilling...");
    }
    public void changeNib(){
        System.out.println("Changing the Nib...");
    }
}
interface BasicAnimal{
    void sleep();
    void eat();
}
class Human extends Monkey implements BasicAnimal{
    public void sleep(){
        System.out.println("Sleeping...");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    void speak(){
        System.out.println("hello sir...");
    }
}
class Monkey {
    public void jump() {
        System.out.println("Jumping...");
    }

    public void bite() {
        System.out.println("Biting...");
    }
}
abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelePhone extends TelePhone {
    public void ring(){
        System.out.println("Riniging...");
    }
    public void lift(){
        System.out.println("Lift the phone...");
    }
    public void disconnect(){
        System.out.println("Disconnect ...");
    }
    public void camera(){
        System.out.println("Click Photo!!");
    }
}

interface TVremote{
    void volumeUp();
    void volumeDown();
}
interface SmartTVremote extends TVremote{
    void openYT();
    void openPlayStore();
}
class TV implements TVremote{
    public void volumeUp(){
        System.out.println("Volume Up...");
    }
    public void volumeDown(){
        System.out.println("Volume Down...");
    }
}