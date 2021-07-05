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
        int sum=0;
        int n = in.nextInt();
        int k = in.nextInt();
        
        int bill[ ] = new int[n];
        for(int j=0;j<n;j++){
            bill[j] = in.nextInt();
        }
        int charged = in.nextInt();
        for(int i=0;i<n;i++){
            if(i!=k){
                sum=sum+bill[i];
            }
        }
        int actual=sum/2;
        int ovrchr=charged-actual;
        if(ovrchr==0){
            System.out.println("Bon Appetit");
        }
        else{
             System.out.println(ovrchr); 
        }
      
    }
}
