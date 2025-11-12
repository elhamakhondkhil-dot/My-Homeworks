
package guessing.numbers;
import java.util.Scanner;
public class GuessingNumbers {

    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    int number=(int)(Math.random()*101);
        System.out.println("Guess a Magic number between 0 to 100");
        int guess=-1;
        
        while(guess!=number){
            System.out.println("\nEnter your guess");
            guess=input.nextInt();
            if (guess==number)
                System.out.println("Yas, the number is "+number);
            else if(guess>number)
                System.out.println("your guess is too high");
            else
                System.out.println(" You are guess is too low");
        }
            
        }
    }
    
