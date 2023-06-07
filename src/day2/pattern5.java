package day2;

import java.util.ArrayList;
import java.util.Scanner;

public class pattern5 {
    public static void pattern( int i,int c,int num){
        if(i==num)
            return;
        for(int j=0;j<=i;j++){
            System.out.print((char)('A'+i)+" ");
        }
        System.out.println();
        pattern(i+1,c,num);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.println("Enter the number");
        int num=sc.nextInt();


        pattern(0,1,num);

    }
}
