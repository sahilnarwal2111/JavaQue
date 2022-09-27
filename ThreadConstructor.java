public class ThreadConstructor {
    public static void main(String[] args) {
        MyThrea bullet = new MyThrea();
        Thread gun = new Thread(bullet,"Sahil");


    }
}
//Thread()
class MyTh extends Thread{
    public MyTh(){
        System.out.println("I m being the simplest constructor!!");
    }
    @Override
    public void run(){
        System.out.println("Simple Thread!!!");
    }

}
//Thread(String name)
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while (i<12){
            System.out.println("I am a thread");
            i++;
        }
    }
}
//Thread(Runnable r)
class MyThre implements Runnable{
    public MyThre(){
        System.out.println("I m the constructor of Thread(Runnable r) ");
    }
    @Override
    public void run(){
        System.out.println("Runnable Thread!!!");
    }
}
//Thread(Runnable r, String n)
class MyThrea implements Runnable{
    public MyThrea(){
        super();
        System.out.println("I m the constructor of //Thread(Runnable r, String n)\n");
    }
    @Override
    public void run(){
        System.out.println("//Thread(Runnable r, String n)\n");
    }
}


