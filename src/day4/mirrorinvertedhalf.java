package day4;

import java.util.Scanner;

public class mirrorinvertedhalf {
    static void print(int i , int n){
        if(i==0)
            return;
        for(int j = n - i; j > 0; j--)
        {
            System.out.print("  ");
        }
        for(int k = 0; k < i; k++)
        {
            System.out.print("* ");
        }
        System.out.println();
        print(  i-1,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        print(n,n);
    }
}
