import java.util.Scanner;

public class HW_01 {
    int arr1[] = new int[10];
    int pos =0;
//    ine element = 0;
    Scanner sc = new Scanner(System.in);
    public void inputElement(){
        System.out.println("Enter the position(<10) where u want to enter element ");
        pos = sc.nextInt();
        for(int i = pos; i < 10;i ++){
            if(arr1[i] != 0){
                arr1[i+1] = arr1[i];
            }
        }

    }

    public static void main(String[] args) {
        HW_01 q1 = new HW_01();

    }
}
