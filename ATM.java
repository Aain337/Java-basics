import java.util.*;
 public class ATM{

   public Card(int card){
      int CARD = 12345;
        if(card==CARD){
           atm();
        }
        else {
         System.out.println("Card declined please try again");
           Card();
        }
   }

   public atm(){
      
    }
    public static void main(String[] args){
      ATM obj = new ATM();
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter your Card");
      int card = sc.nextInt();

    }
 }