import java.util.Scanner;

public class NumberGame {
    public static void main(String args[])
    {   Scanner sc = new Scanner(System.in);
        int chances = 5;
        int finals = 0;
        boolean playAgian = true;
        System.out.println("Welcome Buddy..! ");
        System.out.println("Hey Buddy you have about "+chances+" to win the game..! ");
        while (playAgian) 
        {
            int randam = getrandN(1,100);
            boolean guess = false;
            for(int i = 0;i < chances; i++ )
            {   
                //Printing lefted chance and Requesting user input...
                System.out.println("-->> Lifted your chance "+(6-(i+1))+" ...! ");
                System.out.print("Enter your Guess: ");
                int user = sc.nextInt();
                
                if(user == randam)
                {
                    guess = true;
                    finals = +1;
                    System.out.println("You won the Game..!! ");
                    break; 
                }
                else if (user > randam )
                {
                    System.out.println("Your chance is  Too High ");
                }
                else
                {
                    System.out.println("Your chance is Too Low ");
                }
        
            }

            // Printing  losted game result... 
            if (guess == false)
            {
                System.out.println("Sorry Buddy..! You Lost the Chances... The number is "+randam +"..!");
            }

            //Requesting to User play Game once agian...
            System.out.println("Do you want to Play Again(y/n) ");
            System.out.print("Enter your choice: ");
            String pA = sc.next();
            playAgian = pA.equalsIgnoreCase("y");
            

        }

        //Printing Greetting and Score of User...
        System.out.println("That's it Buddy, Hope you Enjoyed Game..!");
        System.out.println("Here is you Score " + finals);

    }

    //Generating ramdom number...
    public static int getrandN(int min, int max)
    {
        return (int)(Math.random()*(max-min+1)+min);
    }
    
}
