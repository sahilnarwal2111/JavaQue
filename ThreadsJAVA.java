public class ThreadsJAVA {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
    }
}

class MyThread1 extends Thread {
    @Override
    public void run(){
        while (true) {
            System.out.println("Thread is running");
            System.out.println("I m happy!");
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        while (true) {
            System.out.println("Thread2 is good");
            System.out.println("I m sad!!");
        }
    }
}