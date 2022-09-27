import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int [] marks = {12,23,43};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index: ");
        int ind = sc.nextInt();
        try{
            System.out.println("Welcome to video 82");
            try{
                System.out.println(marks[ind]);;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.println("Level 2 Exception");
            }
        }
        catch (Exception e){
            System.out.println("This is level 1 exception 1");
        }

    }
}
