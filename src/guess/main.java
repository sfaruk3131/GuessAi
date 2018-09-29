package guess;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int numguess = 0;
        String guesssent = "It took ";
        String tellRng = "";
        boolean isOver = false;
        int CompNum = (int) (Math.random() * 10);
        Scanner name = new Scanner(System.in);
        System.out.println("Hello there player what is your name");
        String Name = name.next();
        while (isOver == false)
        {
            Scanner input = new Scanner(System.in);
            System.out.println(tellRng = "I have a number in my head between 1 and 10 can " + Name + " guess what it is");
            int guess = input.nextInt();


            if (guess == CompNum)
            {
                isOver = true;
                System.out.println("Congratulations you win!");
                guesssent = guesssent + Name + " " + numguess + " guesses";
                System.out.println(guesssent);


            }
            else
            {
                System.out.println("Please try again");
                numguess = numguess + 1;
            }
        }
    }
}