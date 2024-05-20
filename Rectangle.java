import java.util.Scanner;
public class Rectangle {
public static void main (String[] args) {
int length,breadth,area;
Scanner sc= new Scanner(System.in);
System.out.print("length of the rectangle:");
length=sc.nextInt();
System.out.print("breadth of the rectangle:");
breadth=sc.nextInt();
area=length * breadth;
System.out.print("area of the rectangle:" +area);
}
}

//* Write a code to find the area of a rectangle using inputs for length and width