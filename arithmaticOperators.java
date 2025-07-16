import java.util.*;


       // a Java program that takes two numbers from the user 
       // and performs addition, subtraction, multiplication, division, and modulus operations.


public class arithmaticOperators{

    public void Operations(float num1,float num2){

        //performing the operations on the numbers

        float sum=num1+num2;
        System.out.println("Addition of the numbers = " + sum);
        float diff=num1-num2;
        System.out.println("Subtraction of the numbers = " + diff);
        float multi= num1*num2;
        System.out.println("multiplication of the numbers = "+ multi);
        float divi=num1/num2;
        System.out.println("Division of numbers = " + divi);
        float mod =num1%num2;
        System.out.println("Remainder of numerber = " + mod);
    }
    

    public static void main(String[] args)
    {
        System.out.println("**************************************************************");  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter number 2: ");
        float num2 = sc.nextFloat();
        arithmaticOperators obj1 = new arithmaticOperators();  
        obj1.Operations(num1,num2);
    }
}
