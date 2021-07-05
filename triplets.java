import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        int a[] = new int[3];
        int b[] = new int[3];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<3;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<3;i++){
            b[i]=in.nextInt();
        }
        int ap=0,bp=0;
        for(int i=0;i<3;i++){
            if(a[i]>b[i]){
                ap++;
            }
            else if(b[i]>a[i]){
                bp++;
            }
        }
        System.out.println(ap + " " + bp);
    }
}
