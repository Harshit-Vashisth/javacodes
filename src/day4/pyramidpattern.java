package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class pyramidpattern {
    public static void pattern( int i,int k,int n){
        if(i>n)
            return;

        for(int j=1;j<=n;j++){
            if (j >= k)
                System.out.print("* ");
            else
                System.out.print(" ");
        }

        System.out.println();
        pattern(i+1,k-1,n);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.println("Enter the number");
        int num=sc.nextInt();


        pattern(1,num,num);

    }
}
