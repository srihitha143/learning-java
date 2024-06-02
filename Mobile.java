import java.util.Scanner;
public class Mobile{
    public static void main(String[] args){
        long a;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the moblie number:");
        a =sc.nextLong();
        while(a>0)
        {
            a=a/10;
            count++;
        }
        if(count!=10)
        System.out.print("invalid number");
        else
        System.out.print("valid number");
        
    }
}
//write a program to validate a 10 digit phone number