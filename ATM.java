import java.util.*;
 public class ATM{
   //*********************** Card method *****************************
   public Card(int card){
      int CARD = 12345;
        if(card==CARD){
           Pin();
        }
        else {
         System.out.println("Card declined please try again ");
           Card();
        }
   }
   //*************************** Pin method ************************
   public Pin(){
      int PIN = 4567;
      System.out.println("Please enter the PIN ");
      int pin = sc.nextInt();
      if(pin == PIN){
         Atm();
      }
      else{
         System.out.println("Incorrect Pin please try again ");
         Pin();
      }
   }
   //******************************* Atm method ***********************
   public Atm(){
      System.out.println("Welcome to ATM service \n please select the option ");
      While(True){
         System.out.println("1.Check Balance");
         System.out.println("2.Widthdraw Money");
         System.out.println("3.Transfer Money");
         System.out.println("Deposit Money");
      }
    }
    public static void main(String[] args){
      ATM obj = new ATM();
      Scanner sc = new Scanner(System.in);
      System.out.println("Please insert your Card ");
      int card = sc.nextInt();

    }
 }