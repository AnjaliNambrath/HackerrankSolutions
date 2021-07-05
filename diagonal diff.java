import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
     int n,sum1=0,sum2=0;
     Scanner in = new Scanner(System.in);
     n=in.nextInt();
     int a[][]=new int[n][n];
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             a[i][j]=in.nextInt();
         }
     }   
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             if(i==j){
             sum1=sum1+a[i][j];
             }
         }
     }
         
    for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             if(i==n-j-1){
             sum2=sum2+a[i][j];
             }
         }
     }
     int dif=sum1-sum2;
     dif=Math.abs(dif);
     System.out.println(dif);
    }
}
