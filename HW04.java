import java.util.Objects;
import java.util.Scanner;
public class HW04 {
    String name, job_status;
    float basicSalary;
    HW04(String name, String job_status, float basicSalary){
        this.name = name;
        this.job_status = job_status;
        this.basicSalary = basicSalary;

        float grossSalary =0;
        if(Objects.equals(job_status, "Permanent")){
            grossSalary = (float) ((float) basicSalary + 0.1*basicSalary + 0.5*basicSalary + 0.05*basicSalary + 10000);
        }
        else{
            grossSalary = (float) ((float) basicSalary +  0.5*basicSalary  );
        }
        float netSalary = 0;
        if(grossSalary>100000){
            netSalary = (float) (grossSalary - 0.3*grossSalary - 0.12*grossSalary);
        }
        else if(grossSalary > 50000 && grossSalary < 100000){
            netSalary = (float) (grossSalary - 0.1*grossSalary - 0.12*grossSalary);
        }
        else{
            netSalary = (float) (grossSalary - 0.12*grossSalary);
        }
        System.out.println("Employee name is "+ this.name + " Basic Salary is Rs."+ this.basicSalary+ " and Net Salary = Rs."+ netSalary);
    }

    public static void main(String[] args) {
        HW04 e1 = new HW04("E1", "Permanent", 50000);
        HW04 e2 = new HW04("E2", "Probation", 500000);
        HW04 e3 = new HW04("E3", "Probation", 500000);
        HW04 e4 = new HW04("E4", "Permanent", 75000);
        HW04 e5 = new HW04("E5", "Permanent", 50000);


    }
}
