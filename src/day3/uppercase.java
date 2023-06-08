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
        System.out.println("Enter the number of element");
        int n=sc.nextInt();
        System.out.println("Enter the strings");
        ArrayList<String> arr=new ArrayList<String>();
        for(int i=0;i<n;i++){
            String s=sc.next();
;            arr.add(s);
        }



        int num=arr.size();
        System.out.println(arr);
        upper(arr,num-1);
        System.out.println(arr);
    }
}
