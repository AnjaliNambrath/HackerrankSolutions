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
      int ppl=5,like=0;
      for(int i=0;i<n;i++){
          like=like+(ppl/2);
          ppl=(ppl/2)*3;
      }
      System.out.println(like);
    }
}
