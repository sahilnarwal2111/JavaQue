import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Maximum_Border_Problem {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int[] output = new int[t];
        sc.nextLine();
        int n = 0;
        String[] table = new String[n];
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            String[] n_m = str.split(" ");
            n = Integer.parseInt(n_m[0]);
            int m = Integer.parseInt(n_m[1]);
            table = new String[n];
            for (int j = 0; j < n; j++) {
                table[j] = sc.next();
                sc.nextLine();
            }
        }
        int cur_count = 1;
        for (int k = 0; k < n; k++) {
            String row = table[k];
            int len = row.length();
            int count = 0;
            for (int l = 0; l < len; l++) {

                if (row.charAt(l) == '#') {
                    for (int o = l + 1; o < len; o++) {
                        if (row.charAt(l) != row.charAt(o)) {
                            break;
                        }
                        cur_count++;
                    }
                }
                if (cur_count > count) {
                    count = cur_count;
                }
            }
            output[k] = cur_count;
        }

        for ( int z = 0 ; z < output.length; z ++){
            System.out.println(output[z]);
            output[z] = 0;
        }
    }

}
