package day2;

import java.util.ArrayList;
import java.util.Scanner;

public class elementfromlast {
    public static int search(ArrayList<Integer> arr, int num,int no){
        if(arr.get(num)==no)
            return num;
        if(num==0)
            return -1;
        return search(arr,num-1,no);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.println("Enter the number elements");
        int num=sc.nextInt();
        System.out.println("Enter the elements to be added");
        for(int i=0;i<num;i++){
            int n=sc.nextInt();
            arr.add(n);
        }
        System.out.println("Enter the number to be searched");
        int no=sc.nextInt();
        System.out.println("The number is present at "+search(arr,num-1,no)+" from the end");
    }
}
