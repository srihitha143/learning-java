import java.util.Scanner;
public class Program1 {
public static void main(String[] args) {
int rate;
float quantity,amount;
Scanner sc = new Scanner(System.in);
System.out.print("Rate:");
		rate=sc.nextInt();
System.out.print("Quantity:");
		quantity=sc.nextFloat();
amount=rate * quantity;
System.out.println("amount:"+amount);
}
}

//1. Write a program to cal amount for the input at rate and  quantity  Note : quantity must be a whole number and rate must be a decimal 