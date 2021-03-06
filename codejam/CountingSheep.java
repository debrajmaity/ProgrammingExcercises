import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Problem

 Bleatrix Trotter the sheep has devised a strategy that helps her fall asleep faster. First, she picks a number N. Then she starts naming N, 2 × N, 3 × N,
 and so on. Whenever she names a number, she thinks about all of the digits in that number. She keeps track of which digits (0, 1, 2, 3, 4, 5, 6, 7, 8, and 9)
 she has seen at least once so far as part of any number she has named. Once she has seen each of the ten digits at least once, she will fall asleep.

 Bleatrix must start with N and must always name (i + 1) × N directly after i × N.
 For example, suppose that Bleatrix picks N = 1692. She would count as follows:

 N = 1692. Now she has seen the digits 1, 2, 6, and 9.
 2N = 3384. Now she has seen the digits 1, 2, 3, 4, 6, 8, and 9.
 3N = 5076. Now she has seen all ten digits, and falls asleep.
 What is the last number that she will name before falling asleep? If she will count forever, print INSOMNIA instead.

 Input

 The first line of the input gives the number of test cases, T. T test cases follow. Each consists of one line with a single integer N, the number Bleatrix has chosen.

 Output

 For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the last number that Bleatrix will name before falling asleep, according to the rules described in the statement.

 Limits

 1 ≤ T ≤ 100.
 Small dataset

 0 ≤ N ≤ 200.
 Large dataset

 0 ≤ N ≤ 106.

 Input  Output

 5      Case #1: INSOMNIA
 0      Case #2: 10
 1      Case #3: 90
 2      Case #4: 110
 11     Case #5: 5076
 1692

 */

public class CountingSheep {
   public static void main(String args[]){
      Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
      int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
      if(t>100)
         t=100;

      for(int i=1;i<=t;i++){
         int N=in.nextInt();
         System.out.println("Case #" + i + ": " + getOutput(N));
      }
   }


   private static String getOutput(int N){

      String result="INSOMNIA";
      int[] a=new int[10];
      for(int i=0;i<a.length;i++){
         a[i]=0;
      }

      int c=1;
      while(true){

         int num=c*N;

         if(num==0||N>1000000){
            break;
         }

         int currentNum=num;
         while(num>0){
            a[num%10]=1;
            num=num/10;
         }

         if(sleep(a)){
            result=""+currentNum;
            break;
         }else{
            c++;
         }
      }

      return result;
   }

   private static boolean sleep(int [] a){
      int sum=0;
      for(int i=0;i<a.length;i++){
         sum+=a[i];
      }
      return (sum==10)?true:false;
   }

}
