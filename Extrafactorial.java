import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
       int n;
       Scanner in = new Scanner(System.in);
       n = in.nextInt();
       BigInteger fact = new BigInteger("1");
       for(int i=2;i<=n;i++){
           fact = fact.multiply(BigInteger.valueOf(i));
       } 
       System.out.println(fact);
    }
}
