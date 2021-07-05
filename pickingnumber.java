import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;




 public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num;
        int[] a = new int[100];
        for(int i=0; i < n; i++){
            num=in.nextInt();
            a[num]++;
        }
        int max = 0;
        for (int i = 0; i < 99; i++) {
            max = Math.max(max, a[i]+a[i+1]);
        }
        System.out.println(max);
    }
}