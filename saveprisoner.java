import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
       int t,k=0;
       Scanner in = new Scanner(System.in);
       t = in.nextInt();
       while(k<t){
           int n = in.nextInt();
           int m = in.nextInt();
           int s = in.nextInt();
           int p = (s+m-1)%n;
           if(p==0){
               p=n;
           }
           System.out.println(p);
           k++;
       }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
       int t,k=0;
       Scanner in = new Scanner(System.in);
       t = in.nextInt();
       while(k<t){
           int n = in.nextInt();
           int m = in.nextInt();
           int s = in.nextInt();
           int i=s;
           int c=0;
           while(i<=n){
               c++;
               if(c==m){
                   System.out.println(i);
                   break;
               }
               if(i==n){
                   i=1;
               }
               else{
                   i++;
               }
           }
           k++;
       }
    }
}
