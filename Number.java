//Write a program to read a no and check whether it is positive, negative, or neutral (multiple if vosthai)

import java.util.Scanner;
public class Number {
public static void main(String[] args) {
int a;
Scanner sc= new Scanner(System.in);
a =sc.nextInt();
if (a>=0)
System.out.println("the given number is positive, ie:" +a);
else if (a<0)
System.out.println("the given number is negative, ie:" +a);
else
System.out.println("the given number is neutral ie:" +a);
}
}