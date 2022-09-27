import java.util.Scanner;
public class Exp3que2 {
        int arr[] = new int[10];
        int sum =0;
        Scanner sc = new Scanner(System.in);
        public int squareAndSum(){
            System.out.println("Enter Array elements: ");
            for(int i = 0 ; i< 10 ; i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0 ; i<10; i++){
                arr[i] = arr[i]*arr[i];
            }
            System.out.println("Array after squaring its elements:");
            for (int i = 0 ; i<10; i++){
                System.out.println(arr[i]);
            }
            for(int i = 0; i< 10; i++){
                sum = sum + arr[i];
            }
            return sum;
        }

    public static void main(String[] args) {
        Exp3que2 obj = new Exp3que2();
        System.out.println(obj.squareAndSum());
    }
}


