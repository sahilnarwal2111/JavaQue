class TelephoneExchange{
    float duration;
    TelephoneExchange(float duration){
        this.duration = duration;
    }
}
class ordinary extends TelephoneExchange{
    int rate = 2;
    ordinary(float duration) {
        super(duration);
    }
    public void showBill(){
        System.out.println("Amount Payable (ordinary call): " + this.duration + " x "+rate + " = " +this.duration*rate);
    }
}
class urgent extends TelephoneExchange{
    int rate = 7;
    urgent(float duration) {
        super(duration);
    }
    public void showBill(){
        System.out.println("Amount Payable (urgent call): " + this.duration + " x "+rate + " = " +this.duration*rate);
    }
}
class lightning extends TelephoneExchange{
    int rate = 15;
    lightning(float duration) {
        super(duration);
    }
    public void showBill(){
        System.out.println("Amount Payable (lightning call): " + this.duration + " x "+rate + " = " +this.duration*rate);
    }
}
public class Exp4que4 {
    public static void main(String[] args) {
        ordinary o1 = new ordinary(5);
        urgent u1 = new urgent(3);
        lightning l1 = new lightning(7);
        o1.showBill();
        u1.showBill();
        l1.showBill();
    }
}
