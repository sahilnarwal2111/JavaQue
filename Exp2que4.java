import java.util.*;
public class Exp2que4 {
    Scanner sc = new Scanner(System.in);
    final int TOTAL = 10;
    String[] name = new String[TOTAL];
    int[] marks = new int[TOTAL];
    public void input() {
        for (int i = 0; i < TOTAL; i++) {
            System.out.print("Enter student name:  ");
            name[i] = sc.next();
            System.out.print("Enter the marks:  ");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < marks.length; i++) {
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[i] > marks[j]) {
                    int temp;
                    temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                    String temp1;
                    temp1 = name[i];
                    name[i] = name[j];
                    name[j] = temp1;
                }
            }
        }
    }
    public void display() {
        System.out.println("STUDENT NAME    MARKS     STATUS");
        for (int i = 0; i < TOTAL; i++) {
            if (marks[i] > 40 && marks[i] < 50) {
                System.out.println(name[i] + "                " + marks[i] + "        PASS");
            } else if (marks[i] > 51 && marks[i] < 75) {
                System.out.println(name[i] + "                " + marks[i] + "        MERIT");
            } else if (marks[i] > 75) {
                System.out.println(name[i] + "                " + marks[i] + "        DISTINCTION");
            }
        }
    }

    public static void main(String[] args) {
        Exp2que4 obj = new Exp2que4();
        obj.input();
        obj.display();
    }
}
