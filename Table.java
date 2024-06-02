//Write a Program to Print Table till 12

import java.util.*;
public class Table{
    public static void main(String[] args){
        int a,b,count;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter here:");
        b=sc.nextInt();
        for(count=1;count<=12;count++)
        {
            a=b*count;
         System.out.printf("\n%d * %d =%d",b,count,a);
       
        }
    }
    
    
}