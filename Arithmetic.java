import java.util.Scanner;
public class Arithmetic{
public static void main(String[] args){
double a,b,c,d,e,f,g;
a=b=c=d=e=f=g=0;
Scanner sc= new Scanner(System.in);
System.out.print("enter the first no:");
a=sc.nextDouble();
System.out.print("enter the second no:");
b=sc.nextDouble();
c=a+b;
System.out.println("the addition of these numbers:\n" +c);
d=a-b;
System.out.println("the substraction of these numbers:\n" +d);
e=a*b;
System.out.println("the multiplication of these numbers:\n" +e);
f=a/b;
System.out.println("the division of these numbers:\n" +f);
g=a-b;
System.out.println("the division of these numbers:\n" +g);
}
}

/*5. Write a Program to read two nos at runtime and perform all the arithmetic operations (Addition, Subtraction, Multiplication, Division) and display the result as below.
Sample input:
10
5
output:
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2 */