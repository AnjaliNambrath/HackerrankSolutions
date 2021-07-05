import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]){
        int n,k,c=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int a[ ] = new int[n];
        for(int p=0;p<n;p++){
            a[p]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j && (a[i]+a[j]) % k == 0){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
