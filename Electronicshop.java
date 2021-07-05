import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
      int b,n,m,p;
      Scanner in = new Scanner(System.in);
      b=in.nextInt();
      n=in.nextInt();
      m=in.nextInt();
      int k[]=new int[n];
      for(int i=0;i<n;i++){
          k[i]=in.nextInt();
      }
      int d[]=new int[m];
      for(int i=0;i<m;i++){
          d[i]=in.nextInt();
      }
      int max=0;
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              p=k[i]+d[j];
              if(p<=b && p>max){
                  max=p;
              }
          }
      }
      if(max==0){
          System.out.println(-1);
      }
      else{
          System.out.println(max);
      }
    }
}
