import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
Scanner kb=new Scanner(System.in);
int q=kb.nextInt();

for(int i=0;i<q;i++)
{
int count=0;
int a=kb.nextInt();
int b=kb.nextInt();
int sb=(int)Math.sqrt(b);
int sa=(int)Math.sqrt(a);
for(int j=sa;j<=sb;j++)
{
if((j*j)>=a)
{
count++;
}

}
System.out.println(count);
}
}
}
