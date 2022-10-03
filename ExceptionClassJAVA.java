import java.util.Scanner;
public class ExceptionClassJAVA {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try{
                throw new MyExceptionMethod();
            }
            catch (Exception e){
                System.out.println("Finished");
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
            System.out.println("Yes Finished !");
        }
    }
}
class MyExceptionMethod extends Exception{
    @Override
    public String toString(){
        return "Hello I m toString Method !!";
    }
    @Override
    public String getMessage(){
        return "Hello I m from getMessage() function ";
    }
}
