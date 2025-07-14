import java.io.*;
import java.util.*;
// class Calculator{}

 public class Calculator{
	  public void calculation(){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		float a = sc.nextFloat();
		System.out.println("Enter 2nd number");
		float b = sc.nextFloat();
		System.out.println("Enter the operator(+,-,/,*)");				
		char op = sc.next().charAt(0);
		
		float result;

        switch(op)
        {
            case '+' :
            {
               result= a+b;
			   System.out.print("Total after Addition is : "+result);
                break;
            }
            case '-' :
            {
                result = a-b;
				System.out.print("Total after Subtraction is : " +result);
                break;
            }
            case '*' :
            {
                result = a*b;
				System.out.print("Total after Multiplication is : "+result);
                break;
            }
            case '/' :
            {
               result = a/b;
			   System.out.print("Total after Division is : "+result);
                break;
            }
            default :
            {
                System.out.print("Please select proper operator");
                return;
            }
        }
}
	 
	public static void main(String[] args){
		
		System.out.println("hello World");
		Calculator myobj = new Calculator();
		 myobj.calculation();
		
	}
}