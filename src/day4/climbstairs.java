package day4;

import java.util.Scanner;

public class climbstairs {

        public static int climb(int no) {
            if(no==1||no==2||no==0)
                return no;
            return climb(no-1)+climb(no-2);
        }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter the stair u want to reach");
        int no=sc.nextInt();
        System.out.println("The possible ways are "+climb(no));
    }
}
