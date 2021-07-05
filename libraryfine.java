import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        int d1,m1,y1,d2,m2,y2;
        Scanner in = new Scanner(System.in);
        d1 = in.nextInt();
        m1 = in.nextInt();
        y1 = in.nextInt();
        d2 = in.nextInt();
        m2 = in.nextInt();
        y2 = in.nextInt();
        int fine;
        if(y1<y2){
            fine = 0;
        }
        else if(y1==y2){
            if(m1<m2){
                fine = 0;
                }
                else if(m1==m2){
                    if(d1>d2){
                        fine = (d1-d2)*15;
                    }
                    else{
                        fine = 0;
                    }
                }
            else{
                fine = (m1-m2)*500;
            }
        }
        else{
            fine = 10000;
        }
        System.out.println(fine);
    }
}
