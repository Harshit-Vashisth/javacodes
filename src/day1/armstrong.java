import java.util.Scanner;

public class armstrong {

    public static int armstrong(int number,int sum){
        while(number==0)
            return sum;
       int n=number%10;
       sum+=(n*n*n);
        return armstrong(number/10,sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the numbers");
        num=sc.nextInt();
       int sum=0;

        int ans=armstrong(num,sum);
        if(ans==num)
            System.out.println("Its is armstrong");
        else
            System.out.println("Its not armstrong");
    }
}
