
package hotel1;

import java.util.*;
public class HotelM1 {
    public static void main(String[] args) {
        int y = 0;
        int a;
        int b;
        String item=" ";
        int price;
        int eachcost; 
        int cost = 0;
    Scanner sc = new Scanner(System.in);
    Date date =new Date();
    System.out.println("Enter your name :");
     String name= sc.next();
        System.out.println(" ");
        System.out.println("Hotel Name\t\t"+"user name \t\t\t"+"Date And Time");
        System.out.println(" ");
        System.out.println("welcome to star hotel\t\t"+name+ "\t\t\t"+date.toString());
        System.out.println("");
        System.out.println("See Menu Card");
        System.out.println("Item Name\t\t"+"Price\t\t\t"+"press to order");
        System.out.println(" ");
        System.out.println("Rice and dal\t\t"+"60\t\t\t"+"1");
        System.out.println("Dosa\t\t\t"+"40\t\t\t"+"2");
        System.out.println("Dal and Bhaji\t\t"+"50\t\t\t"+"3");
        System.out.println("Finni\t\t\t"+"50\t\t\t"+"4");
        System.out.println("Biriyani\t\t"+"100\t\t\t"+"5");
        System.out.println(" ");
        System.out.println(" ");
        ArrayList Order= new ArrayList();
        ArrayList Price= new ArrayList();
        ArrayList Plate= new ArrayList();  
        
        
        do{
            System.out.println("Press to order :");
            a = sc.nextInt();
            System.out.println("You have pressed\t"+a);
            System.out.println(" ");
            System.out.println("enter the number of plates");
            b=sc.nextInt();
            System.out.println(" ");
            System.out.println("Item Name\t\t"+"Number of plates\t\t\t"+"Total");
            System.out.println(" ");
           
            if(a==1)
           {
                item = "Rice and Dal";
                price =60; 
                eachcost= price*b;
                cost+=eachcost;
               System.out.println(item+"\t\t\t"+b+"\t\t\t\t\t"+eachcost);
               Order.add(item);
                Price.add(eachcost);
                Plate.add(b);
           }
            if(a==2)
           {
                item ="Dosa\t";
                price =40;
                eachcost= price*b;
                cost+=eachcost;
                System.out.println(item+"\t\t\t"+b+"\t\t\t\t"+eachcost);
                Order.add(item);
                Price.add(eachcost);
                Plate.add(b);
           }
            
           if(a==3)
           {
              item ="Dal and Bhaji";
              price =50;
              eachcost = price*b;
              cost+=eachcost;
               System.out.println(item+"\t\t\t"+b+"\t\t\t\t\t"+eachcost);
               Order.add(item);
                Price.add(eachcost);
                Plate.add(b);
           }
           if(a==4)
           {
             item="Finni\t";
             price=50;
             eachcost =price*b;
             cost+=eachcost;
               System.out.println(item+"\t\t\t"+b+"\t\t\t\t"+eachcost);
               Order.add(item);
                Price.add(eachcost);
                Plate.add(b);
           }
           if(a==5)
           {
            item = "Biryani\t";
            price=100;
            eachcost = price*b;
            cost+=eachcost;
               System.out.println(item+"\t\t\t"+b+"\t\t\t\t\t"+eachcost);
               Order.add(item);
                Price.add(eachcost);
                Plate.add(b);
           }
            System.out.println("");
            System.out.println("");
            System.out.println("Do you want to continue the order press 1 /otherwise press 0 ");
            y=sc.nextInt();
        
        }
        while(y!=0);
            System.out.println(" ");
            System.out.println("Report :");
            System.out.println(" ");
            System.out.println("item name\t\t"+"No. of plates\t\t\t"+"sub total");
            Iterator itr=Order.iterator();
            Iterator itr1=Price.iterator();
            Iterator itr2=Plate.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next()+"\t\t"+itr2.next()+"\t\t\t\t"+itr1.next());
              
            }
            System.out.println("");
            System.out.println("");
            System.out.println("Total :"+cost);
            System.out.println(" ");
            System.out.println("Thank you for visiting our hotel"+" "+name+"\t\t"+"signature");

            
    }

}
