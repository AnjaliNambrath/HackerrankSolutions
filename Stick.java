import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Stick{
    public static void main(String[] args) throws IOException {
       int n;
       Scanner in = new Scanner(System.in);
       n = in.nextInt();
       int a[] = new int[n];
       for(int i=0;i<n;i++){
           a[i] = in.nextInt();
       }
       int c=n;
       Arrays.sort(a);
       int min=a[n-1];
       while(c!=0){           
           for(int i=0;i<n;i++){
               if(a[i]<min && a[i]!=0){
                   min=a[i];
               }
           }
           System.out.println(c);
           if(c==1){
               break;
           }
           for(int i=0;i<n;i++){
               if(a[i]!=0){
               a[i] = a[i]-min;
               if(a[i]==0){
                   c--;
               }
            }
           }
       }
    }
}
