import java.util.Scanner;
public class Product {
public static void main(String[] args) {
    int a,b,c;
    Scanner sc= new Scanner(System.in);
    System.out.print("enter a:");
    a=sc.nextInt();
    System.out.print("enter b:");
    b=sc.nextInt();
    c= a * b;
    System.out.print("product of these inputs: " +c);
}
}

//*  Write a code to find the product of two numbers using inputs