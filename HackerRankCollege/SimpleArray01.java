package HackerRankCollege;

import java.util.Scanner;

public class SimpleArray01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i< n ; i++){
            arr[i]= sc.nextInt();
        }
        int sum = 0;
        for(int x: arr){
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
