//Biggest of two number using ternary operators 

import java.util.Scanner;
public class BiggestTwo {
public static void main(String[] args) {
int a,b,biggest;
Scanner sc= new Scanner(System.in);
a=sc.nextInt();
System.out.print("enter the value:" +a);

b=sc.nextInt();
System.out.print("enter the value" +b);


biggest=(a>b)?a:b;
System.out.print("the biggest number is:" +biggest);
}
}