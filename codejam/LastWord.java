import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by dmaity on 4/15/16.
 */
public class LastWord {
   public static void main(String args[]){
      Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
      int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
      if(t>100)
         t=100;

      for(int i=1;i<=t;i++){
         String pattern=in.next();
         System.out.println("Case #" + i + ": " + getOutput(pattern));
      }
   }

   private static String getOutput(String pattern){
      String output="";
      String prev="";
      String cur1="",cur2="";
      for(int i=0;i<pattern.length();i++){
         cur1=pattern.charAt(i)+prev;
         cur2=prev+pattern.charAt(i);
         prev=(cur1.compareTo(cur2)>0)?cur1:cur2;
         //prev=compareString(cur1,cur2);

      }
      output=prev;
      return output;
   }

//   private static String compareString(String A, String B){
//      int val=A.compareTo(B);
//      if(val>0){
//         return A;
//      }
//
//      return B;
//   }

}
