
package reversefivedigitnumber;

import java.util.Scanner;


public class ReverseFiveDigitNumber {

   
    public static void main(String[] args) {
        
        int number1,number2,number3,number4,number5,number6,number7,number8,n;
        
        Scanner bunny=new Scanner(System.in);
        System.out.println("enter the 3-digit number:");
        n=bunny.nextInt();
        
        number1=n/10000;
        n=n%10000;
        
        number3=n/1000;
        n=n%1000;
        
        number5=n/100;
        n=n%100;
        
        number7=n/10;
        n=n%10;
        
        System.out.println("Reversed number is:"+n+number7+number5+number3+number1);
    }
    
}
