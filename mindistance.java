import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        int n,dis=0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int p=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && a[i]==a[j]){
                    dis=Math.abs(j-i);
                    p=Math.min(p,dis);
                }
            }           
        }
        if(dis==0){
                p=-1;
            }
        System.out.println(p);
    }
}
