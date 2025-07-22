import java.util.*;

public class GradeCalculator{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of subjects -------------------------");
        int subj = sc.nextInt();
        float total = 0;
        float obtain = 0;
        for(int i = 1; i<=subj; i++){

            System.out.println(" ");
            System.out.println("Enter the subject numbers ");
            float subjno = sc.nextFloat();

            System.out.println(" ");
            System.out.println("Enter the obtained numbers ");
            float obtno = sc.nextFloat();

            total += subjno;
            obtain += obtno;           
        }

        System.out.println("\n -----------------------------------------------");
        System.out.println("\n Total marks are " + total);
        System.out.println("\n obtained marks are " + obtain);
        float percen = (obtain/total)*100;
        System.out.println("\n Percentage = " + percen);
    }
}