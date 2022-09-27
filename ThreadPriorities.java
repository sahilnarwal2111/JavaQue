public class ThreadPriorities {
    public static void main(String[] args) {
        MyThread01 t1 = new MyThread01("Sahil1(***************)");
        MyThread01 t2 = new MyThread01("Sahil2");
        MyThread01 t3 = new MyThread01("Sahil3");
//        MyThread01 t4 = new MyThread01();
//        MyThread01 t5 = new MyThread01();MyThread01
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThread01 extends Thread {
    MyThread01(String n){
        super(n);
    }
    public void run(){
        int i = 0;
        while (i<20) {
            System.out.println("Thank You!" + this.getName());
            i++;
        }
    }
}