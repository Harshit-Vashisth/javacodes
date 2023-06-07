import java.util.Scanner;

public class stringpalindromeloop {

    public static boolean palindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int i, j;
        System.out.println("Enter the strings");
        s = sc.nextLine();
        i = 0;
        j = s.length() - 1;

        if (palindrome(s, i, j))
            System.out.println("Its a palindrome string");
        else
            System.out.println("Its not a palindrome");
    }
}