import java.util.*;

class table{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want multiplication table of : ");
        int a = sc.nextInt();
        for (int i = 0; i<=10; i++)
        {
          int num = a*i;
          System.out.println(a +" * "+ i + " = " + num);
        }
    }
}