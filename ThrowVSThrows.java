import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ThrowVSThrows {

    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
            return Math.PI * r * r;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Radius::");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        try{
            area(r);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be nagative";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negavtive";
    }
}
