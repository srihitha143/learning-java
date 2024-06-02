/*write a program to read from the user the nos util the user gives 0; and count the even and odd numbers and display. 
do-while is sutiable for it cause first we should read the input*/

import java.util.Scanner;
public class DoWhile{
    public static void main(String[] args){
        long no,even_no,odd_no;
        no=even_no=odd_no=0;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("enter the number:");
        no=sc.nextLong();
        if(no%2==0)
        even_no++;
        else
        odd_no++;
        }while(no!=0);
        System.out.print("the no of even numbers are:" +even_no);
        System.out.print("\nthe no of odd numbers are:" +odd_no);
    }
    
    
}