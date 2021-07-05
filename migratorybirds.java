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
        int type[]=new int[6];
        for(int i=0;i<n;i++){
            int index=a[i];
            type[index]=type[index]+1;
        }
        int max=0,maxtype=0;
        for(int i=1;i<6;i++){
            if(type[i]>max){
                max=type[i];
                maxtype=i;
            }
        }
        System.out.println(maxtype);
    }
}
