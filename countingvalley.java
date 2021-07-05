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
      int c=0,k=1;
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      String p = in.next();
      char[] ch = p.toCharArray();
      for(int i=0;i<n;i++){
          if(ch[i]=='D'){
              k--;
          }
          else{
              k++;
          }
          if(k==1 && ch[i]=='U'){
              c++;
          }
      }
      System.out.println(c);  
    }
}
