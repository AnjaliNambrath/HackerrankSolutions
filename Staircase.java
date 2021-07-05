import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Staircase {
    public static void main(String[] args) throws IOException {
       int n;
       Scanner in = new Scanner(System.in);
       n=in.nextInt();
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int k=n-i+1;k<=n;k++){
               System.out.print("#");
           }
           System.out.println();
       }
    }
}
