import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int s[ ]=new int[n];
        for(int i=0;i<n;i++){
            s[i]=in.nextInt();
        }
        int hs=s[0],ls=s[0],h=0,l=0;
        for(int i=1;i<n;i++){
            if(s[i]>hs){
                h++;
                hs=s[i];
            }
            if(s[i]<ls){
                l++;
                ls=s[i];
            }
        }
        System.out.println(h+" "+l);
    }
}