import java.util.Scanner;
public class SwapWithoutThirdVari {
public static void main(String[] args){
    int a,b;
    Scanner sc =new Scanner(System.in);
    System.out.print("a before swapped:");
    a=sc.nextInt();
    System.out.print("b before swapped:");
    b=sc.nextInt();
    
    a=a+b;//oka value vosthadhi
    b=a-b;//if we take out b then we get orginal a
    a=a-b;//if we take out a then we get orginal b

    System.out.print("after swapped a :" + a + ", after swapped b:" +b);

}
}

//3. Write a Program to Swap the Values of two variables A and B without using the third variable.