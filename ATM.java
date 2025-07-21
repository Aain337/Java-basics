import java.util.*;
 public class ATM{

   //*********************** Card method *****************************
   public void Card(int card)
   {
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
   public void Pin()
   {
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
   public void Atm()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Welcome to ATM service \n please select the option ");
      float Balance = 1000;
       while(true)
        {
            System.out.println("1. Check Balance");
            System.out.println("2. Widthdraw Money");
            System.out.println("3. Transfer Money");
            System.out.println("4. Deposit Money");
            System.out.println("5. Exit ");
            int input = sc.nextInt();
           switch(input)
            {
                  case 1 :
                  {
                        System.out.println("Your current balance is: " + Balance);
                        break;
                  }
                  case 2 :
                  {
                        System.out.println("Select the amount to withdraw: ");
                        float amount = sc.nextFloat();
                        if(amount > Balance)
                        {
                           System.out.println("The Balnce is not enough...\n Your balnce is: " + Balance);
                           break;
                        }
                        else
                        {
                           Balance = Balance-amount;
                           System.out.println("Your amount is withdrawn.");
                           System.out.println("Your current Balance is :" + Balance);
                        }
                        break;
                  }
                  case 3 :
                  {
                        System.out.println("Select the amount to transfer: ");
                        float transfer = sc.nextFloat();
                         if(transfer > Balance)
                        {
                           System.out.println("The Balnce is not enough...\n Your balnce is: " + Balance);
                           break;
                        }
                        else
                        {
                        System.out.println("Enter the number, you want to transfer to: ");
                        int receiver = sc.nextInt();
                        Balance = Balance - transfer;
                        System.out.println("The amount " + transfer + " is tranfered to " + receiver);
                        System.out.println("Your remaining Balance is: " + Balance);
                        }
                        break;
                  }
                  case 4 :
                  {
                        System.out.println("Deposit the amount you want: ");
                        float deposit = sc.nextFloat();
                        Balance = Balance + deposit;
                        System.out.println("Your current balnce is: "+ Balance);
                        break;
                  }
                  case 5 :
                  {
                     System.out.println("Thankyou for availing our services.");
                     System.out.println("Please take your card.");
                     return;
                  }
                  default :
                  {
                     System.out.println("Please select the right option....");
                     return;
                  }     
            }
         }
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