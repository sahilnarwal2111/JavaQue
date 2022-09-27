import javax.xml.namespace.QName;
import java.util.Scanner;

public class Exp7que1 {
    public static int[] rollNo = new int[10];;
    public static String [] name = new String[10];
    public void input(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            System.out.println("Enter the roll no and name for " + (i+1));
            rollNo[i] = sc.nextInt();
            name[i] = sc.next();
        }
    }
    public static void main(String[] args) {
        Exp7que1 q = new Exp7que1();
        q.input();
        try {
            for (int i = 0; i <=rollNo.length; i++){
                System.out.println("Name is "+ name[i]+ " ROll No "+rollNo[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
