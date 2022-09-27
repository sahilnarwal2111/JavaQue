import java.util.Scanner;

public class Sleep_deprivation {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
//        sc.nextInt();
        for(int i = 0 ; i < t; i++){
            int x = sc.nextInt();
            if(x < 7){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
