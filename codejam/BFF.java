import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by dmaity on 4/15/16.
 */
public class BFF {
   public static void main(String args[]){
      Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
      int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
      if(t>100)
         t=100;

      for(int i=1;i<=t;i++){
         int N=in.nextInt();
         int[] arr=new int[N];
         int[] a=new int[N];
         for(int j=0;j<N;j++){
            arr[j]=in.nextInt();
            a[j]=1;
         }
         System.out.println("Case #" + i + ": " + getOutput(arr,a));
      }
   }

   private static int getOutput(int[] arr,int[] a){

      int count=0;
      boolean canFind=true;
      int i=0;
      int cur=0;
      int prev=0;
      while(canFind){

         if(a[i]==0){

            if(arr[i]==1){
               break;
            }

            int val=search(arr,a,arr[i]);
            if(val==-1) {
               canFind = false;
            }else{
               i=val-1;
            }
            count--;
         }

         cur=arr[i];
         a[i]=0;
         count++;
         prev=i+1;
         i=cur-1;


      }
      return count;
   }

   private static int search(int[] arr,int[] a, int cur){
      for(int j=0;j<arr.length;j++){
         if((arr[j]==cur)&&a[j]==1){
            a[j]=0;
            return arr[j];
         }
      }
      return -1;
   }
}
