package day5;
import java.util.*;
public class mazepath {

        static  ArrayList<String> res;
        static int[][] visited;
        public static void findPaths(int[][] m,int row,int col,String s,int n){
            if(row==n-1 && col==n-1){
                res.add(s);
                return;
            }
            else{
                visited[row][col]=1;
            }
            if(row+1<n && visited[row+1][col]==0 && m[row+1][col]==1){
                findPaths(m,row+1,col,s+"D",n);                         //DOWN
            }
            if(col-1>=0 && visited[row][col-1]==0 && m[row][col-1]==1){
                findPaths(m,row,col-1,s+"L",n);                     //LEFT
            }
            if(col+1<n && visited[row][col+1]==0 && m[row][col+1]==1){
                findPaths(m,row,col+1,s+"R",n);                   //RIGHT
            }
            if(row-1>=0 && visited[row-1][col]==0 && m[row-1][col]==1){
                findPaths(m,row-1,col,s+"U",n);                   //UP
            }
            visited[row][col]=0;
        }
        public static ArrayList<String> findPath(int[][] m, int n) {
            visited = new int[n][n];
            res= new ArrayList<>();
            if(m[0][0]==0){
                return res;
            }
            String s="";
            findPaths(m,0,0,s,n);
            return res;
        }


}
