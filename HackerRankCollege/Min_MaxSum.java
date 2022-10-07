package HackerRankCollege;

import java.util.Scanner;

public class Min_MaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long arr[] = new long[5];
        for(int i = 0; i< 5; i++){
            arr[i]= sc.nextLong();
        }
        long min = arr[0];
        long max = arr[0];
        long sum = 0;
        for(int i = 0; i<5;i++){
            if(arr[i]>min){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
            sum = sum + arr[i];
        }
        long minSum = sum-max;
        long maxSum = sum-min;
        System.out.print(minSum);
        System.out.print(" ");
        System.out.print(maxSum);
    }
}
