package day4;

import java.util.Scanner;

public class hollowsquarepattern {
    static void print_rectangle(int n, int i)
    {
        if(i>n)
            return;
        int j;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= n; j++)
            {
                if (i == 1 || i == n ||
                        j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        print_rectangle(n,1);
    }
}
