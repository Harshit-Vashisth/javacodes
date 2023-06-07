package day2;

import java.util.ArrayList;
import java.util.Scanner;

public class indexes {
    public static ArrayList<Integer> search(ArrayList<Integer> arr,int i, int num, int no,ArrayList<Integer> ans){
        if(i==num)
            return ans;
        if(arr.get(i)==no)
            ans.add(i);
        return search(arr,i+1,num,no,ans);
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
        ArrayList<Integer> ans=new ArrayList<>();
        System.out.println("The number is present at "+search(arr,0,num,no,ans)+" from the end");
    }
}
