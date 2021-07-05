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
      String time = in.nextLine();
      String splitime[] = time.split(":");
      String hour = splitime[0];
      String min = splitime[1];
      String sec = splitime[2].substring(0,2);
      String meridian = splitime[2].substring(2,4);
      if(meridian.equals("AM")){
          if(hour.equals("12"))
              hour="00";
          
          System.out.println(hour+":"+min+":"+sec);
      }
      else{
          if(!hour.equals("12")){
              int h = Integer.parseInt(hour);
              h=h+12;
              hour=""+h;
          }
          System.out.println(hour+":"+min+":"+sec);
      }
    }
}
