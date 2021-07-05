import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
       int n,k,q;
       Scanner in = new Scanner(System.in);
       n = in.nextInt();
       k = in.nextInt();
       q = in.nextInt();
       int a[] = new int[n];
       for(int i=0;i<n;i++){
           a[i] = in.nextInt();
       }
       int query[] = new int[q];
       for(int i=0;i<q;i++){
           query[i] = in.nextInt();
       }
       k=k%n;
       for(int p=0;p<k;p++){
           int x = a[n-1];
           for(int i=n-1;i>0;i--){
             a[i] = a[i-1];  
           }
           a[0] = x;
       }
       for(int i=0;i<q;i++)
       System.out.println(a[query[i]]);
    }
}
