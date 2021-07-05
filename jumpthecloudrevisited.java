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
        int c[] = new int[n];
        for(int i=0;i<n;i++){
            c[i] = in.nextInt();
        }
        int e=100;
        int i=0;
        do{            
            if(c[(i+k)%n]==1){
                e=e-3;
            }
            else{
                e=e-1;
            }
            i=(i+k)%n;
        }while(i!=0);
        System.out.println(e);
    }
}
