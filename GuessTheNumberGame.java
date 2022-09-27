import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Game obj = new Game();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter a number between 0-100");
        while (true){

            n = sc.nextInt();
            obj.setNum(n);

            if(obj.isCorrect() == 0){
                System.out.println("Congratulations You Won !" );
                System.out.println("Number of counts "+ obj.count);
                break;
            }
            else if (obj.isCorrect() == 1) {
                obj.Counter();
                System.out.println("Higher Number Please");
            }
            else {
                obj.Counter();
                System.out.println("Lower NUmber please!");
            }
        }

    }
}

class Game{
    int userNumber;
    int compNumber;
    int counter = 0;
    public Game(){
        Random random = new Random();
        compNumber = random.nextInt(100);
    }
    public void setNum(int n){
        userNumber = n;
    }
    public int isCorrect(){
        if(userNumber > compNumber){
            return -1;
        }
        else if(userNumber<compNumber){
            return 1;

        }
        else {
            return 0;
        }

    }
    int count =0;
    public void Counter() {
        count++;
    }
}
