package day4;

import java.util.Scanner;

public class patternsquare {
    static void solve(int i,int n){
        if(i==n)
            return;
        for(int j=0;j<n;j++)
            System.out.println(" * ");
        solve(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        solve(0,n);
    }
}
