package day3;

import java.util.ArrayList;
import java.util.Scanner;

public class productlsit {
    public static int product(ArrayList<Integer> arr, int num, int product){
       product*=arr.get(num);
        if(num==0)
            return product;
        return product(arr,num-1,product);
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
        System.out.println("The product number is  "+product(arr,num-1,1));
    }
}
