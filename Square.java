import java.util.Scanner;
public class Square {
public static void main(String[] args) {
    int side,area;
    Scanner sc= new Scanner(System.in);
    System.out.print("side of the square:");
    side= sc.nextInt();
    area= side * side;
    System.out.print("area of the square:"+area);
}
}

//* Write a code to find the area of a square using inputs for a side