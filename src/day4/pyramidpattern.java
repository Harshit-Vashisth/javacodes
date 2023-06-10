package day4;

import java.util.Scanner;

public class pyramidpattern {
    static void print(int i , int n,int k){
        if(i>n)
            return;
        for (int j = 1; j <= n; j++) {

            // Condition to print star pattern
            if (j >= k)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
        print(  i+1,n,k-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        print(1,n,n);
    }
}
