class Worker{
    String name;
    float salaryRate;
    Worker(String name, float salaryRate){
        this.name = name;
        this.salaryRate = salaryRate;
    }
}

class DailyWorker extends Worker{
    int hours;
    DailyWorker(String name, float salaryRate, int hours) {
        super(name, salaryRate);
        if(hours>40){
            this.hours = 40;
        }
        else {
            this.hours = hours;
        }
    }
    void ComPay(){
        System.out.println("Name: "+ this.name + "  Salary: "+ this.salaryRate*hours);
    }
}
class SalariedWorker extends Worker{
    SalariedWorker(String name, float salaryRate) {
        super(name, salaryRate);
    }
    void ComPay(){
        System.out.println("Name: "+ this.name + "  Salary: "+ this.salaryRate*40);
    }
}
public class Exp4que3 {
    public static void main(String[] args) {
        DailyWorker d1 = new DailyWorker("A", 45.6f,6);
        SalariedWorker s1 = new SalariedWorker("B", 6.7f);
        d1.ComPay();;
        s1.ComPay();
    }
}
