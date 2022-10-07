package HackerRankCollege;

import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] num = str.split(" ");
        int numbers[] = new int[n];
        for(int i =0; i< n; i++){
            numbers[i] = Integer.parseInt(num[i]);
        }
        int sum = 0;
        for(int x:numbers){
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
