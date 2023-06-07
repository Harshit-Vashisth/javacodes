import java.util.Scanner;

public class primerangeloop {


        public static boolean prime(int number,int c){
            while(c!=number) {
                if (number % c == 0)
                    return false;
                c++;
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int r1,r2;
            System.out.println("Enter the range of numbers");
            r1=sc.nextInt();
            r2=sc.nextInt();
            int c=2;
            for(int i=r1;i<=r2;i++) {
                if (prime(i, c))
                    System.out.println(i);
            }
        }
}
