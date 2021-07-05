import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
    public class Solution{
    public static void main(String[] args) throws IOException {
        int n,m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int c[] = new int[m];
        for(int i=0;i<m;i++){
            c[i] = in.nextInt();
        }
        int a[] = new int[n];
        int max=0,dis=0;
        for(int i=0;i<n;i++){
            if(n==m){
                break;
            }
            int min=n;
            for(int j=0;j<m;j++){                
                  dis=Math.abs(c[j]-i);
                  min=Math.min(dis,min);
        }
        a[i]=min;        
    }
    for(int k=0;k<n;k++){
        max=Math.max(max,a[k]);
    }
    System.out.println(max);
    }
}