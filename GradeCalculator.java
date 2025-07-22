import java.util.*;

public class GradeCalculator{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of subjects ");
        int subj = sc.nextInt();
        float total;
        float obtain;
        for(int i = 1; i<=subj; i++){
            System.out.println("Enter the subject total marks ");
            total = sc.nextFloat();
            System.out.println("Enter the obtained marks ");
            obtain = sc.nextFloat();
            total += total;
            obtain += obtain;           
        }
        float percen = (obtain/total)*100;
        System.out.println("Total marks are "+total);
        System.out.println("obtained marks are "+obtain);
        System.out.println("Percentage = "+percen);
    }
}