import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        int n,m,d;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();  
        int s[]=new int[n];
        for(int p=0;p<n;p++){
            s[p]=in.nextInt();
        }
        d=in.nextInt();
        m=in.nextInt();
        int c=0;
       for(int i=0;i<=n-m;i++){
           int sum=0;
           for(int j=i;j<i+m;j++){
               sum=sum+s[j];
           }
           if(sum==d){
               c++;
           }          
       }
       System.out.println(c);
    }
}
