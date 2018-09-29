package guess;

import java.util.Scanner;

public class AI {
    public static void main(String[] args)
    {
        boolean inRange = false;
        boolean isRight = false;
        String AskQ = "";
        String Intro = "";
        System.out.println("Hello player what is your name!");
        Scanner name = new Scanner(System.in);
        String plyname = name.next();

        System.out.println(Intro = "Hello " + plyname + " please input a number ,and I will try to guess it!");


        while(inRange == false)
        {

            Scanner input = new Scanner(System.in);
            int plynum = input.nextInt();
            if (plynum >= 1 && plynum <= 100)
            {
                inRange = true;
            }
            else
            {
                System.out.println("Please choose a different input!");
                inRange = false;

            }
        }

        int CompGuess = 0;

        System.out.println(plyname + " is your number " + CompGuess);

        Scanner enter = new Scanner(System.in);

        if(enter == CompGuess)
        {
            System.out.println("Your number is " + CompGuess);
        }
        else
        {
            while(isRight == false)
            {
                if(enter ==  "higher" )
                {

                }
            }
    }
}
