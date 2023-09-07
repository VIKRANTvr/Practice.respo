/* PrintOrderDetails Write a program that takes an order ID, item name, quantity,
and total cost as command line arguments and prints a sentence like "Order [ID]:
[Quantity] of [Item] for a total of Rs [Cost]. */

public class OrderDetails{
public static void main(String[]args){

if(args.length !=4){
System.out.println("Your Order Details : OrderDeatils [order id] [item name] [quantity] [Total cost]");
}
else{
String orderid=args[0];
String itemname=args[1];
String quantity=args[2];
String Totalcost=args[3];

System.out.println("Order - "+ orderid +" : "+ itemname + " " + quantity + " for a total of Rs "+ Totalcost + " . ");
}
}
}