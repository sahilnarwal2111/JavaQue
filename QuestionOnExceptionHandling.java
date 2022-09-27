import java.util.Scanner;

public class QuestionOnExceptionHandling {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
//        boolean flag = true;
        int ind = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the index number");
            ind = sc.nextInt();

            try {
                System.out.println("The value at given index is " + arr[ind]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please Enter a Different number for index");

            }
        }
    }
}
