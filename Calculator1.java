import java.util.*;
import java.io.*;
public class calculator1
{

    public void addition(float num1,float num2)
    {
        float add = num1+num2;
        System.out.println("addition = "+add);
    }


    public void subtraction(float num1,float num2)
    {
        float sub = num1-num2;
        System.out.println("subtraction = "+sub);
    }

    public void multiplication(float num1,float num2)
    {
        float multi = num1*num2;
        System.out.println("multiplications = "+multi);
    }

    public void division(float num1,float num2)
    {
        float divi = num1/num2;
        float remain = num1%num2;
        System.out.println("division = "+divi);
        System.out.println("with remainder = "+remain);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        calculator1 obj = new calculator1();
        System.out.println("Enter first number : ");
        float num1 = sc.nextFloat();
        System.out.println("Enter second number : ");
        float num2 = sc.nextFloat();
        System.out.println("Enter the operator: \n +\n-\n*\n/");
        char operator = sc.next().charAt(0);
        
        if (operator == '+')
        {
            obj.addition(num1,num2);
        }
        else if (operator == '-')
        {
            obj.subtraction(num1,num2);
        }
        else if(operator == '*')
        {
            obj.multiplication(num1,num2);
        }
        else if(operator == '/')
        {
            obj.division(num1,num2);
        }
        else
        {
            System.out.println("please select the correct operator!");
            main(null);
        }
    }
}