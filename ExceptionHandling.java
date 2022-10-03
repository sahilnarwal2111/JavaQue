import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        //Writea program to print all prime numbers
        //logical error demo
//        System.out.println(2);
//        for (int i = 0; i< 10; i++){
//            System.out.println(2*i+1);
//        }-->logical error
//        int k ;
        Scanner sc = new Scanner(System.in);
//        k = sc.nextInt();
//        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
//        int a = 100;
//        int b  =0;
//        try{
//            System.out.println("Result is "+a/b);
//        }
//        catch (Exception e){
//            System.out.println("WE failed reason : "+e);
//            System.out.println(e);
//        }
//        System.out.println("End");
        int [] marks = {12,23,43};
        System.out.println("Enter the index here!");
        int ind = sc.nextInt();
        System.out.println("Enter the number bby which u want to divide!");
        int num = sc.nextInt();
        try{
            System.out.println("The value at index is "+marks[ind]);
            System.out.println("The value at index/number is "+marks[ind]/num);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception ocurred ! "+ e);
        }
    }
}
