import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
int min=101;
int[] a = new int[n];
int[] b = new int[m];
for(int i=0;i<n;i++)
    a[i]=s.nextInt();
for(int i=0;i<m;i++){
    b[i]=s.nextInt();
    min=Math.min(min,b[i]);
}
int count=0,flag,f;
for(int i=1;i<=min;i++){
    flag=1;
    for(int j=0;j<m;j++){
        if(b[j]%i!=0)
            flag=0;
    }
    if(flag==1){
        f=1;
        for(int k=0;k<n;k++){
            if(i%a[k]!=0)
                f=0;
        }
        if(f==1)
            count++;
    }
}
System.out.println(count);
}
}
