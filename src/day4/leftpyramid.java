package day4;

import java.util.Scanner;
public class leftpyramid {
    static void print(int i , int rows){
        if(i>rows)
            return;
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
        System.out.println();
            print(  i+1,rows);
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no of elements");
            int n=sc.nextInt();
            print(1,n);
        }
}
