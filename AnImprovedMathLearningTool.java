
package an.improved.math.learning.tool;

import java.util.Scanner;

public class AnImprovedMathLearningTool {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num1=(int)(Math.random()*10);
    int num2=(int)(Math.random()*10);
    if (num1<num2){
        int temp=num1;
        num1=num2;
        num2=temp;
    }System.out.println("What is "+num1+"-"+num2+"?");
    int answer=input.nextInt();
    if (num1-num2==answer)
            System.out.println("You are correct");
    else {
        System.out.println("You are answer is wrong");
        System.out.println(num1+"-"=num2+"should be"+(num1-num2==answer));
    }
    }
    
}
