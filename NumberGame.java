package Project;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    int computer;

    public NumberGame() // constructor
    {
        Random rd = new Random();
        computer = rd.nextInt(100);
        System.out.println("Guess the Number from 1 to 100");

    }

    public int computerNo() // method which store no given by the system
    {
        return computer;
    }
}

    class GuessNumber
    {
        static int takeUserInput() // method to take input from the user
        {
            System.out.println("Enter the number :");
            Scanner sc=new Scanner(System.in);
            int user=sc.nextInt();
            return user;
        }


        static void isCorrectNumber(int i,int j)
        {
            if (i == j)
            {
                System.out.println("Correct Number Guess !!");
            }
            else if (i>j)
            {
                System.out.println("Your number is too high than computer number");
            }
            else
            {
                System.out.println("Your number is too low than computer number ");
            }
        }

        public static void main(String[] args) {

            int user=0;
            int computer=0;
            int iteration=0;


       NumberGame obj=new NumberGame();

       do {
           user=takeUserInput();
           computer= obj.computer;
           isCorrectNumber(user,computer);
           iteration++;
         }while (user != computer);
        System.out.println("YOU GUESS NO.IN "+iteration+"ITERATIONS");

       }
    }

