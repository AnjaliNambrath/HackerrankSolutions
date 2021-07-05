import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        int i,j,k;
        int c=0;
        Scanner in = new Scanner(System.in);
        i=in.nextInt();
        j=in.nextInt();
        k=in.nextInt();
        while(i<=j){
            int rev=0;
            int p=i;
            while(p!=0){
                int rem=p%10;
                rev=(rev*10)+rem;
                p=p/10;
            }
            int diff=Math.abs(i-rev);
            if(diff % k == 0){
                c++;
            }
            i++;
        }
        System.out.println(c);
    }
}
 