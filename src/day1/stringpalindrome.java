import java.util.Scanner;

public class stringpalindrome {

    public static boolean palindrome(String s,int i,int j){
        if(i>=j)
            return true;
        if(s.charAt(i)!=s.charAt(j))
            return false;
        return palindrome(s,i+1,j-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,j;
        System.out.println("Enter the string");
        s=sc.nextLine();
        i=0;
        j=s.length()-1;

            if (palindrome(s,i, j))
                System.out.println("Its a palindrome string");
            else
                System.out.println("Its not a palindrome");
        }
}
