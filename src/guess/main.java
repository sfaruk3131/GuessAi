package guess;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int numguess = 0;
        String guesssent = "";
        boolean isOver = false;
        int CompNum = (int) (Math.random() * 10);
        Scanner name = new Scanner(System.in);
        System.out.println("Hello there player what is your name");
        String Name = name.next();
        while (isOver == false) {
            Scanner input = new Scanner(System.in);
            System.out.println("I have a number in my head between  can you guess what it is?");
            int guess = input.nextInt();


            if (guess == CompNum) {
                isOver = true;
                System.out.println("Congratulations you win!");


            } else {
                System.out.println("Please try again");
                numguess = numguess + 1;
            }
        }
    }
}