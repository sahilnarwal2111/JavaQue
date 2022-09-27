import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberHarrySolution {
    public static void main(String[] args) {
        Game1 g1 = new Game1();
        while (true) {
            g1.takeUserInput();
            boolean b = g1.isCorrectNumber();
            System.out.println(b);
        }
    }
}
class Game1{
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    void Game(){
        Random random = new Random();
        this.number = random.nextInt(100);

    }
    void takeUserInput(){
        System.out.println("Guess the number between 1 and 100");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        if(inputNumber == number){
            return true;
        }
        else if(inputNumber < number){
            System.out.println("Too less...");
        }
        else {
            System.out.println("Too more...");
        }
        return false;
    }

}
