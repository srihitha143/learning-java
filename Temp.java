import java.util.Scanner;
public class Temp {
public static void main(String[] args){
double c,f;
Scanner sc= new Scanner(System.in);
System.out.print("the given temperature in celsius:");
c=sc.nextDouble();
f=((9* c) /5) + 32;
System.out.print("converted in fahrenheit:" +f);
}
}
/*2. Write a Java program to take the temperature from the user in Celsius, convert it into Fahrenheit, and display it to the user. You can use the following formula for this purpose:
F=9C/5+32
Where C is the temperature in Celsius and F is the temperature in Fahrenheit.
Note: You can assume that C and F are integer values. */