/*1. Write a Java Program to Calculate Amount for the Rate and Quantity, Calculate a 10% discount on the amount and print the final bill amount.
Note: The rate of the items must be taken in decimal nos only. */

import java.util.Scanner;
public class RateAndQuantity {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

double rate, quantity, total_bill, discount, discounted_bill;

rate=sc.nextDouble();
System.out.print("rate of the item:" +rate);

quantity=sc.nextDouble();
System.out.println("quantity of the item:" +quantity);

total_bill=rate * quantity;
System.out.println("total bill of the items:" +total_bill);

discount=total_bill * 0.10;
System.out.println("discount:" +discount);

discounted_bill=total_bill - discount;
System.out.println("the bill after discount is:" +discounted_bill);

}
}