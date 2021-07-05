import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]){
        int x1,v1,x2,v2;
        Scanner in = new Scanner(System.in);
        x1=in.nextInt();
        v1=in.nextInt();
        x2=in.nextInt();
        v2=in.nextInt();
        if(v1>v2&&(x2-x1)%(v1-v2)==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }


        in.close();
    }
}
