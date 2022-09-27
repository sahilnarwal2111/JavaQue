import java.util.Scanner;
public class Exp3que3 {
    Scanner sc = new Scanner(System.in);
    public void monthName() {
        System.out.println("Enter the month: ");
        int num = sc.nextInt();
        switch (num) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("Feb");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Please Enter correct month number!");

        }
    }

    public static void main(String[] args) {
        Exp3que3 obj = new Exp3que3();
        obj.monthName();
    }
}
