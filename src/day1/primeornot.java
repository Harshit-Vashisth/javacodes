import java.util.Scanner;

public class primeornot {

    public static boolean prime(int number,int c){
        if(c==number)
            return true;
        if(number%c==0)
            return false;
        if(number%10==0)
            c++;
        return prime(number/10,c+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter the number");
        number=sc.nextInt();
        int c=2;
        System.out.println(prime(number,c));
    }
}
