import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
       int t;
       Scanner in = new Scanner(System.in);
       t = in.nextInt();
       for(int i=0;i<t;i++){
            int n = in.nextInt();
            int k = in.nextInt();
           int a[] = new int[n];
           for(int j=0;j<n;j++){
               a[j] = in.nextInt();               
         }
         int c=0;
         for(int p=0;p<n;p++){
             if(a[p]<=0){
                 c++;
             }
         }
         if(c>=k){
             System.out.println("NO");
         }
         else{
             System.out.println("YES");
         }
       } 
    }
}
