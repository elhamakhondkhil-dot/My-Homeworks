/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap.two.numbers;

import java.util.Scanner;
public class SwapTwoNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = input.nextInt();
        System.out.println("Enter second number:");
        int b = input.nextInt();
        a= a + b;
        b = a -b ;
        a = a - b;
        System.out.println("After Swap: a = " + a + ",b = " + b );
        input.close();
    }
    
}
