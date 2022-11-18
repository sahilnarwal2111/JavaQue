import java.util.*;
public class Exp2que1 {
    Scanner sc = new Scanner(System.in);

    public void compare() {
        int num1, num2, num3,largest, temp;
        System.out.println("Enter the first number");
        num1 = sc.nextInt();
        System.out.println("Enter the second number");
        num2 = sc.nextInt();
        System.out.println("Enter the third number");
        num3 = sc.nextInt();
        temp = num1>num2?num1:num2;
        largest = num3>temp?num3:temp;
        System.out.println("The largest number is "+largest);
    }
    public static void main(String[] args) {
        Exp2que1 obj = new Exp2que1();
        obj.compare();
    }
}




