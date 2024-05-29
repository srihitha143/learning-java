//Write a program to read marks of subject java, the maximum marks is 100, if the user input marks greater than 100 then display a message “invalid marks” otherwise do nothing
import java.util.Scanner;
public class Marks {
public static void main(String[] args){
Scanner sc=new Scanner (System.in);
int a;
a=sc.nextInt();
if(a>100)
System.out.println("invalid marks");
else if(a<0)
System.out.println("invalid");
}
}