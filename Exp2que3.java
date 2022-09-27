import java.util.Scanner;
public class Exp2que3 {
    String name;
    int SAP_ID;
    public void inputDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = sc.nextLine();
        System.out.println("Enter your SAP ID");
        this.SAP_ID = sc.nextInt();
    }
    public void outputDetails(){
        System.out.println("Name is "+ this.name+"        SAP ID: "+this.SAP_ID);
    }
    public static void main(String[] args) {
        Exp2que3 s1 = new Exp2que3();
        Exp2que3 s2 = new Exp2que3();
        s1.inputDetails();
        s2.inputDetails();
        s1.outputDetails();
        s2.outputDetails();
    }
}
