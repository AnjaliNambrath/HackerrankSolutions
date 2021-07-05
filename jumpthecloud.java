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
        n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        int i=0,c=0;
        while(true){            
            if(i+2<n && a[i+2]==0){
                i=i+2;
            }
            else if(i+1<n){
                i=i+1;
            }
            else{
               break; 
            }
            c++;
            }
        System.out.println(c);
    }
}
