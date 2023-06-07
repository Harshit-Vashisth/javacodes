import java.util.*;
public class countnumberofzero {

    public static int count(int number,int c){
        if(number==0)
            return c;
        if(number%10==0)
            c++;
        return count(number/10,c);
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
