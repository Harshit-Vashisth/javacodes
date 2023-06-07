import java.util.Scanner;

public class countnumberzeroloop {

    public static int count(int number,int c){
        while(number!=0) {
            if (number % 10 == 0)
                c++;
            number /= 10;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter the number");
        number=sc.nextInt();
        int c=0;
        System.out.println(count(number,c));
    }
}
