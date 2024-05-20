import java.util.Scanner;
public class Studentprecentage {
public static void main(String[] args) {
    int no_of_present,class_strength;
    float percentage;
    Scanner sc= new Scanner(System.in);
    System.out.print("no of students in the class:");
    no_of_present = sc.nextInt();
    System.out.print("class_strength:");
    class_strength = sc.nextInt();
    percentage=((float)no_of_present/class_strength) * 100;
    System.out.print("percentage of the class:" +percentage);
}
}

//Write a code to find the present student percentage of a class using inputs as number of presents and class strength
