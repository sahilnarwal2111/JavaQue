import java.util.Scanner;

public class PracticeSetExceptionHandling {





    public static void main(String[] args) {
////        int b = 3 --> Syntax Error
//        int a = 2, b =3;
//        int c = a-b;
////        System.out.println("The sum of a and b is "+c); -->Logical Error
//        //Runtime error
//        int x = 100;
//        int y = 0;
////        int z = x/y;
//        try{
//            System.out.println(x/y);
//        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//        }

//        Problem 2
//        try{
//            int a = 999/0;
//
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("HeHe");
//        }
//        catch (ArithmeticException e){
//            System.out.println("Haha");
//        }

        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        int count = 0;
        int ind;
        while(count<5){
            try{
                System.out.println("Enter the index");
                Scanner sc = new Scanner(System.in);
                ind = sc.nextInt();
                System.out.println("The Element at index " + ind + " is " + arr[ind]);
                break;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Please retry !!!");
            }
            count ++;
            if(count == 5){
                Problem4 p = new Problem4();
                p.toString();
                break;
            }
        }

    }
}

class Problem4 extends Exception{
    @Override
    public String toString(){

        return "Your attempts are maxed out !";

    }
}