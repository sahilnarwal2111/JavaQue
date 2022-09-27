//import java.util.Scanner;
//public class Exp3que1 {
//    Scanner sc = new Scanner(System.in);
//    public void function(){
//        Scanner sc = new Scanner(System.in);
//        int num;
//        System.out.println("Enter the three digit number: ");
//        num = sc.nextInt();
//        int d1 = num % 10;
//        num = num / 10;
//        int d2 = num % 10;
//        num = num / 10;
//        int d3 = num % 10;
//        System.out.println("Possible outcomes: ");
////        if(d1 != 0){
////            System.out.print(d1);
////            System.out.print(d2);
////            System.out.print(d3);
////            System.out.println();
////            if(d2 != d3) {
////                System.out.print(d1);
////                System.out.print(d3);
////                System.out.print(d2);
////                System.out.println();
////            }
////        }
////        if(d2 != 0){
////            System.out.print(d2);
////            System.out.print(d3);
////            System.out.print(d1);
////            System.out.println();
////            if(d1!=d3) {
////                System.out.print(d2);
////                System.out.print(d1);
////                System.out.print(d3);
////                System.out.println();
////            }
////        }
////        if(d3 != 0){
////            System.out.print(d3);
////            System.out.print(d2);
////            System.out.print(d1);
////            System.out.println();
////            if(d1!=d2) {
////                System.out.print(d3);
////                System.out.print(d1);
////                System.out.print(d2);
////                System.out.println();
////            }
////        }
//    }
//    public static void main(String[] args) {
//        Exp3que1 obj = new Exp3que1();
//        obj.function();
//    }
//}

import java.util.Scanner;
class random1{
    int[] number=new int[3];
    public void Taking_input() {
        Scanner n = new Scanner(System.in);
        //int[] number=new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter the number %d: ", i + 1);
            number[i] = n.nextInt();
        }
    }
    public void output(){
        System.out.println("All possible outcomes without repetition: ");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    if((number[i]!=number[j])&&(number[j]!=number[k])&&(number[i]!=number[k]))
                    {
                        System.out.println(number[i]+""+number[j]+""+number[k]);
                    }
                }
            }
        }
    }
}
public class Exp3que1 {
    public static void main(String[] args) {
        random1 a=new random1();
        a.Taking_input();
        a.output();

    }

}