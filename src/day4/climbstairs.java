package day4;

public class climbstairs {

    class Solution {

        public int climbStairs(int n) {
            if(n==1||n==2)
                return n;
            return climbStairs(n-1)+climbStairs(n-2);
        }
    };
}
