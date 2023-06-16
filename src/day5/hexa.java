import java.io.*;
import java.util.*;

class Solution {


    public String convert(int n) {
        // your solutions goes here..
        int decimalNumber = octdec(n);
        return dechex(decimalNumber);
    }

    public static int octdec(int octalNumber) {
        if (octalNumber == 0) {
            return 0;
        } else {
            return (octalNumber % 10) + 8 * octdec(octalNumber / 10);
        }
    }

    public static String dechex(int num) {
        if (num == 0) {
            return "";
        } else {
            int remainder = num % 16;
            String hex = gethex(remainder);
            return dechex(num / 16) + hex;
        }
    }

    public static String gethex(int value) {
        if (value < 10) {
            return String.valueOf(value);
        } else {
            return String.valueOf((char) ('A' + value - 10));
        }
    }
}

public class hexa{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Reading N and K
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);

        Solution solution = new Solution();
        String result = solution.convert(n);
        System.out.println(result);
    }
}