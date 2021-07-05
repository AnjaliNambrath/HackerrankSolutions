import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
      int n=26;
      Scanner in = new Scanner(System.in);
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=in.nextInt();
      }
      String word=in.next();
      int maxheight=0;
      for(int i=0;i<word.length();i++){
        if(maxheight<a[word.charAt(i)-97]){
          maxheight=a[word.charAt(i)-97];
      }
      }
      System.out.println(word.length()*maxheight);
    }
}
