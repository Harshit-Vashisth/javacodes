import java.util.*;
class Countdigit{
    public static int count(int number,int c){
        if(number==0)
            return c;
        return count((number/10),(c+1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Countdigit obj=new Countdigit() ;
        int number;
        System.out.println("Enter the number");
        number=sc.nextInt();
        int c=0;
        System.out.println(count(number,c));
    }
}