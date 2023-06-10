package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class diagonalpattern {
    public static void pattern( int i,int num) {
        if (i >= num)
            return;
        for (int j = 0; j < num; j++) {
            if (i == j) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        pattern(i + 1, num);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.println("Enter the number");
        int num=sc.nextInt();


        pattern(0,num);

    }

}
