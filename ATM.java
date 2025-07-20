import java.util.*;
 public class ATM{

   //*********************** Card method *****************************
   public void Card(int card){
      Scanner sc = new Scanner(System.in);
      int CARD = 12345;
        if(card==CARD){
           Pin();
        }
        else {
         System.out.println("Card declined please try again ");
           //System.out.println(Card()); 
        }
   }
   //*************************** Pin method **************************
   public void Pin(){
      Scanner sc = new Scanner(System.in);
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
   public void Atm(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Welcome to ATM service \n please select the option ");
      float Balance = 1000;
    //   while(true){
    //     System.out.println("1. Check Balance");
    //     System.out.println("2. Widthdraw Money");
    //     System.out.println("3. Transfer Money");
     //    System.out.println("4. Deposit Money");
           int input = sc.nextInt();
           switch(input)
           {
            case 1 :
            {
               System.out.println("Your current balance is:" + Balance);
            }
            case 2 :
            {
               System.out.println("Select the amount: ");
            }
           }
      //}
    }
    //************************* main method **************************
   public static void main(String[] args){
      ATM obj = new ATM();
      Scanner sc = new Scanner(System.in);
      System.out.println("Please insert your Card ");
      int card = sc.nextInt();
      obj.Card(card);
    }
 }