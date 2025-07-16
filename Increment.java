import java.util.*;

public class Increment{

    public static void main(String[] args){

        //program for increment and decreement
       System.out.println("**************************************************************");
       int a = 6;
       int b = 10;
       a += 2;
       int pre = ++a;
        System.out.println("the pre-increments: "+ pre);
        b -= 2;
        int post = b--;    //it will print first b then decreases b by 1.
        System.out.println("the post decrement = "+post);

    }
}