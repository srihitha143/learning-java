//Write a program to read avg marks of a student , and display whether the student is pass or fail. Note: pass %=40.
import java.util.Scanner;
public class PassFail {
public static void main (String[] args) {
int a;
Scanner sc= new Scanner (System.in);
a=sc.nextInt();
if(a>=40)
System.out.print("passes");
else
System.out.print("fail");
}
}