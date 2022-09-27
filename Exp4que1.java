class Bank{
    String name;
    int accNumber;
    private double balance = 23444.00;
    private int pwd = 9999;
    private void showBalance_password(){
        System.out.println("Password is "+ pwd);
        System.out.println("Balance is  "+ balance);
    }
    public void showName_AccountNumber() {
        System.out.println("Name is " + name);
        System.out.println("Account Number is " + accNumber);
    }
}
class customer extends Bank{
    void showMyAllData() {
        System.out.println("Name is " + name);
        System.out.println("Account number is " + accNumber);
//        System.out.println("Password is " + pwd);
//        System.out.println("Balance is "+ balance);
    }
}
public class Exp4que1 {
    public static void main(String[] args) {
        Bank sbi = new Bank();
//        sbi.showBalance_password();
        sbi.showName_AccountNumber();
        customer c1 = new customer();
        c1.showMyAllData();
    }
}
