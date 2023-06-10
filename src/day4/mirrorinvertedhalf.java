package day4;

import java.util.Scanner;

public class mirrorinvertedhalf {
    static void print(int i , int n){
        if(i==0)
            return;
        for (int j = 1; j <= n; j++) // looping columns
        {
            if (j >= i) {
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
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
