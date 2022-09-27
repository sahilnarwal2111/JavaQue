public class FinallyBloack {
    public static int divide(){
        try {
            int a = 50;
            int b = 0;
            int c = a / b;
            return c;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("I will be running at any cost no matter how many times u return the whole function");
        }
        return 1;
    }
    public static void main(String[] args) {
//        divide();
        int a = 50;
        int b = 9;
        while(true){
            try{
                System.out.println(a / b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I m working here for value of b "+b);
            }
            b--;
            }
        }


}
