import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        int p,d,m,s;
        Scanner in = new Scanner(System.in);
        p = in.nextInt();
        d = in.nextInt();
        m = in.nextInt();
        s = in.nextInt();
        int c=0,cost=p;
        while(s>=cost) {
            c++;
            s-=cost;
            if(cost-d>m)
                cost-=d;
            else
                cost=m;
        }
        System.out.println(c);
     }
}
