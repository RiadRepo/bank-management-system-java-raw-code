
package bankMngemnt;

import java.util.Scanner;


public class bank {
     String customerName;
     String customerId;
     int Balance;
     int previousTransection;
    
    bank(String cname, String cid){
        
         customerName = cname;
         customerId = cid;
    }
       
    void deposit(int amount){
        if(amount !=0){
         Balance = Balance+amount;     
          previousTransection=amount;  
        }
    }
     void withdraw(int amount){
        if(amount !=0){
          Balance = Balance-amount;
          previousTransection=-amount;
            
            
            
        }
        
       }
     void getPreviousTransection(){
         if(previousTransection>0){
             System.out.println("your previous transection is :" + previousTransection);  
         }
         else if(previousTransection<0){
             System.out.println("your previous Transection is :" +previousTransection);
     }
         else{
             System.out.println("no transection occured");
         }
     }
     
     void showMenu(){
         char option = 0;
         Scanner scanner =new Scanner(System.in);
         
         System.out.println("Enter your name :");
         customerName = scanner.nextLine();
         
         System.out.println("Enter your Id :");
          customerId = scanner.nextLine();
         System.out.println("\n");
         System.out.println("welcome :"+customerName);
         System.out.println("id :"+customerId);
         
         
         System.out.println("\n");
         System.out.println("A. check balance");
         System.out.println("B. Deposit");
         System.out.println("C. withdraw");
         System.out.println("D. previous transaction");
         System.out.println("E. exit");
         do {
             System.out.println("=============================================");
             System.out.println("Enter Your option ");
             System.out.println("==============================================");
             option = scanner.next().charAt(0);
             System.out.println("\n");
         switch(option)
         {
             case 'A' :
                 System.out.println("--------------------------------------------");
                 System.out.println("your balance is :" +Balance);
                 System.out.println("--------------------------------------------");
                 System.out.println("\n");
               break;
             case 'B' :
                  System.out.println("---------------------------------------------");
                  System.out.println("Enter an amount of deposite" );
                  System.out.println("---------------------------------------------");
                  int amount=scanner.nextInt();
                  deposit(amount);
                  System.out.println("\n"); 
                  break;
             case 'C' :
                  System.out.println("----------------------------------------------");
                  System.out.println("Enter an amount of withdraw");
                  System.out.println("----------------------------------------------");
                  int amount1 = scanner.nextInt();
                  withdraw(amount1);
                  System.out.println("\n");
                  break;
             case 'D' :
                  System.out.println("-----------------------------------------------");
                  getPreviousTransection();
                  System.out.println("-----------------------------------------------");
                  System.out.println("\n");
             break;
             case 'E' :
                 System.out.println("-----------------");
             
             
             break;
             default :
                  System.out.println("invalid option! please enter again");
             
             
         }
                          
         }
         while( option != 'E');
         System.out.println("thank you for using this service");
         
     }
}
