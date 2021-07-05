import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int i=1;i<=q;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int A = Math.abs(a-c);
            int B = Math.abs(b-c);
            if(A==B){
                System.out.println("Mouse C");
            }
            else if(A>B){
                System.out.println("Cat B");
            }
            else{
                System.out.println("Cat A");
            }
        }
    }
}
