import java.util.Random;
import java.util.Scanner;

public class Numberguessinggame{
    public static void main(String[] args) {
        Random random =new Random();
        Scanner sc=new Scanner(System.in);
        int randomnumber=random.nextInt(100)+1;
        //System.out.println(randomnumber);
        int attempts=5;
        while(attempts>0){
        System.out.println("You have only "+attempts +" attempts left"+"\n");
        System.out.println("Enter your guess from 1 to 100"+"\n");
        int guess=sc.nextInt();
        if(guess==randomnumber)
        {
            System.out.println("Correct! Your guess is right"+"\n");
            // Displaying the score on the basis of attempts 
            // if the no attempts is 1  Score = 10;
            // if the no attempts is 2  Score =8;
            System.out.println("Score is based on number of your attempts"+"\n");
            if(attempts==5)
            {
                System.out.println("Your Score is "+ attempts*2);
            }
            
            break;
        }
        else if(randomnumber > guess)
        {
            System.out.println("Sorry !! The number is higher. Guess again .");
        }
        else
        {
            System.out.println("Sorry !! The number is lower. Guess again.");
        }
        attempts--;
    }
    

        
    }
}