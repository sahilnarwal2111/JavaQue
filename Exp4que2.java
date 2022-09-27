class Player{
    String name;
    Player(String name){
        this.name = name;
    }
}
class Cricket_Player extends Player{
    Cricket_Player(String name) {
        super(name);
        System.out.println(this.name+ " is Cricket player");
    }
}
class Football_Player extends Player{
    Football_Player(String name) {
        super(name);
        System.out.println(this.name+ " is Football player");
    }
}
class Hockey_Player extends Player{
    Hockey_Player(String name) {
        super(name);
        System.out.println(this.name+ " is Hockey player");
    }
}
public class Exp4que2 {
    public static void main(String[] args){
        Cricket_Player cp1 = new Cricket_Player("A");
        Football_Player fp1 = new Football_Player("B");
        Hockey_Player hp1 = new Hockey_Player(("C"));

    }
}