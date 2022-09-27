public class Interfaces {
    public static void main(String[] args) {
        AvonBicycle cycleSahil = new AvonBicycle();
        cycleSahil.blowHorn();
        cycleSahil.lightOn();
        cycleSahil.applyBrake(1);
        System.out.println(cycleSahil.a);
//        cycleSahil.a = 12;


    }
}
interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface Bicycle2{
    void lightOn();
}
class AvonBicycle implements Bicycle, Bicycle2{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo!!");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake!!");
    }
    public void speedUp(int increment){
        System.out.println("Speeding Up!");
    }
    public void lightOn(){
        System.out.println("Turning on the lights ...");
    }
}
