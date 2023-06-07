package day3;

import java.util.ArrayList;
import java.util.Scanner;

public class uppercase {
    public static void upper(ArrayList<String> arr, int num){
        String s=arr.get(num).toUpperCase();
        arr.set(num,s);
        if(num==0)
            return ;
      upper(arr,num-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<String>();
        System.out.println("Enter the number String");
        int num=sc.nextInt();
        System.out.println("Enter the strings");
        for(int i=0;i<num;i++) {
            String n = sc.nextLine();
            arr.add(n);
        }
        System.out.println(arr);
        upper(arr,num-1);
        System.out.println(arr);
    }
}
