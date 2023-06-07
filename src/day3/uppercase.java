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

        arr.add("haasas");
        arr.add("Djsaid");
        arr.add("jands");
        arr.add("haasas");
        arr.add("Djsaid");
        arr.add("jands");

        int num=arr.size();
        System.out.println(arr);
        upper(arr,num-1);
        System.out.println(arr);
    }
}
