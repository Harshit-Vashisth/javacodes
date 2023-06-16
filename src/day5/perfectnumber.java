package day5;
import java.io.*;
import java.util.*;
class Solution {
    public static boolean prefect(int number) {
        if (number <= 1) {
            return false;
        }
        return number == sum(number, number - 1);
    }

    public static int sum(int number, int divisor) {
        if (divisor == 1) {
            return 1;
        }
        if (number % divisor == 0) {
            return divisor + sum(number, divisor - 1);
        } else {
            return sum(number, divisor - 1);
        }
    }

    public ArrayList<Integer> perfect(int n) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for (int i = 2; i < n; i++) {
            if (prefect(i))
                arr.add(i);
        }
        return arr;
    }
}

class prefectnumber{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);

        Solution solution = new Solution();
        ArrayList<Integer> result = solution.perfect(n);
        System.out.println(result);
    }
}