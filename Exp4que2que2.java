class Player01{
    String name;
    Player01(String name){
        this.name = name;
    }
}
class Cricket_Player01 extends Player01{
    Cricket_Player01(String name) {
        super(name);
    }
    public void showInfo(){
        System.out.println(this.name+ " -- Cricket");
    }
}
class Football_Player01 extends Player01{
    Football_Player01(String name) {
        super(name);
    }
    public void showInfo(){
        System.out.println(this.name+ " -- Football");
    }
}
class Hockey_Player01 extends Player01{
    Hockey_Player01(String name) {
        super(name);
    }
    public void showInfo(){
        System.out.println(this.name+ " -- Hockey");
    }
}
public class Exp4que2que2 {
    public static void main(String[] args){
        Cricket_Player01 a = new Cricket_Player01("Player_1");
        Football_Player01 b = new Football_Player01("Player_2");
        Hockey_Player01 c = new Hockey_Player01(("Player_3"));
        a.showInfo();
        b.showInfo();
        c.showInfo();

    }
}