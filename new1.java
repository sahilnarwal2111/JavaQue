import java.util.Scanner;

public class new1 {
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int d1 = num % 10;
        num = num / 10;
        int d2 = num % 10;
        num = num / 10;
        int d3 = num % 10;
        System.out.printf("%d %d %d",d1,d2,d3);

    }
}
