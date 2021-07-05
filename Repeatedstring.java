import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       String s = in.next();
       long n = in.nextLong();
       long c=0,q=0;
       char[] ch = s.toCharArray();
       for(int i=0;i<s.length();i++){
           if(ch[i]=='a'){
               c++;
           }
       }
       long sl=s.length();
       long rep=(n/sl);
       long rem=(n%sl);
       for(int i=0;i<rem;i++){
           if(ch[i]=='a'){
               q++;
           }
       }
       long result = (rep*c)+q;
       System.out.println(result);
    }
}
