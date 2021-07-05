import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       int n= in.nextInt();
       int c=0,max=0;
       int num;
        int[] a = new int[101];
        for(int i=0;i<n; i++){
            num=in.nextInt();
            a[num]++;
        }
       for(int i=1;i<101;i++){
           c=c+a[i];
           max = Math.max(max,a[i]);
       }
       System.out.println(c-max);
    }
}
