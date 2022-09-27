
public class PracticeSetThreads {
    public static void main(String[] args) {
        goodMorning t1 = new goodMorning();
        welcome t2 = new welcome();
        t1.start();
        t1.setPriority(4);
        t2.start();
        t2.setPriority(5);
    }
}
class goodMorning extends Thread{
    public void run(){
        try{
            Thread.sleep(450);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Good Morning!");
    }
}
class welcome extends Thread{
    public void run(){
        System.out.println("Welcome!!!");
    }
}