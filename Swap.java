import java.util.Scanner;
public class Swap {
public static void main(String[] args) {
int a,b,c;
a=b=c=0;
Scanner sc= new Scanner(System.in);
System.out.print("enter a:");
a=sc.nextInt();
System.out.print("enter b:");
b=sc.nextInt();

c=a;
a=b;
b=c;

System.out.print("swapped a value:"+a);
System.out.print(" swapped b value:"+b);
}
}
 //Write a program to swap values of the variables a&b.(done)