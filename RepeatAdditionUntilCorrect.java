
package repeat.addition.until.correct;
import java.util.Scanner;
public class RepeatAdditionUntilCorrect {

    public static void main(String[] args) {
  Scanner input=new Scanner (System.in);
  int num1=(int)(Math.random()*10);
  int num2=(int)(Math.random()*10);
        System.out.println("What is "+num1+"+"+num2+"?");
        int answer=input.nextInt();
 while (num1+num2 !==answer){
     System.out.println("Wrong answer .try again.What is "+num1+"+"+num2+"?");
     answer=input.nextInt();
 }System.out.println(" you got it");
    }
    
}
