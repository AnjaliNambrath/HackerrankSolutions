import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        int n,k;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int max = a[0];
    for(int i=0;i<n;i++){
        if(a[i]>max){
            max = a[i];
        }
    }
    if(k>max){
        System.out.println(0);
    }
    else{
        System.out.println(max-k);
    }

    }
}
