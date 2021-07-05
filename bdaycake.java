import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
       int n;
       Scanner in = new Scanner(System.in);
       n=in.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
           a[i]=in.nextInt();
       }
       int k=0;
       for(int i=0;i<n;i++){
           if(a[i]>k){
               k=a[i];
           }
       }       
       int c=0;
       for(int i=0;i<n;i++){
           if(a[i]==k){
               c++;
           }
       }
       System.out.println(c);
    }
}
 
