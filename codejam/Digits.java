import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Problem
 * <p>
 * You just made a new friend at an international puzzle conference, and you asked for a way to keep in touch. You found the following note slipped under your hotel room door the next day:
 * <p>
 * "Salutations, new friend! I have replaced every digit of my phone number with its spelled-out uppercase English representation ("ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE" for the digits 0 through 9, in that order)
 * , and then reordered all of those letters in some way to produce a string S. It's up to you to use S to figure out how many digits are in my phone number and what those digits are, but I will tell you that my phone number consists of those digits in nondecreasing order. Give me a call... if you can!"
 * <p>
 * You would to like to call your friend to tell him that this is an obnoxious way to give someone a phone number, but you need the phone number to do that! What is it?
 * <p>
 * Input
 * <p>
 * The first line of the input gives the number of test cases, T. T test cases follow. Each consists of one line with a string S of uppercase English letters.
 * <p>
 * Output
 * <p>
 * For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is a string of digits: the phone number.
 * <p>
 * Limits
 * <p>
 * 1 ≤ T ≤ 100.
 * A unique answer is guaranteed to exist.
 * Small dataset
 * <p>
 * 3 ≤ length of S ≤ 20.
 * <p>
 * Large dataset
 * <p>
 * 3 ≤ length of S ≤ 2000.
 * <p>
 * Sample
 * <p>
 * <p>
 * Input
 * 4
 * OZONETOWER
 * WEIGHFOXTOURIST
 * OURNEONFOE
 * ETHER
 * <p>
 * Output
 * Case #1: 012
 * Case #2: 2468
 * Case #3: 114
 * Case #4: 3
 */
public class Digits {

   private static Map<Integer, List<String>> digitMaps = new HashMap<>();

   private static int[] digitOrder = { 0, 2, 4, 6, 8, 1, 3, 5, 7, 9 };

   public static void main(String args[]) {
      Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
      int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
      if (t > 100)
         t = 100;
      createDigitMap();
      for (int i = 1; i <= t; i++) {
         String N = in.next();
         System.out.println("Case #" + i + ": " + getOutput(N));
      }
   }

   private static String getOutput(String input) {
      StringBuilder result = new StringBuilder();
      List<Integer> digit_res = new ArrayList<>();
      boolean present = true;
      int count = 0;
      List<String> patterns = null;
      Map<String, Integer> charMap = new HashMap<>();
      for (int i = 0; i < input.length(); i++) {
         count = 0;
         Character key = input.charAt(i);
         if (charMap.containsKey(key.toString())) {
            count = charMap.get(key.toString());
         }
         charMap.put(key.toString(), ++count);
      }

      int i = 0;
      while (!charMap.isEmpty()) {

         patterns = digitMaps.get(digitOrder[i]);
         for (String S : patterns) {
            if (!present(S, charMap)) {
               present = false;
               break;
            }
         }
         if (present) {
            for (int j = 0; j < getDigitWord(digitOrder[i]).length(); j++) {
               Character key = getDigitWord(digitOrder[i]).charAt(j);
               int val = charMap.get(key.toString());
               if (val == 1) {
                  charMap.remove(key.toString());
               } else {
                  charMap.put(key.toString(), --val);
               }
            }
            digit_res.add(digitOrder[i]);
         } else {
            i++;
            present = true;
         }
      }

      Collections.sort(digit_res);

      for (int digit : digit_res) {
         result.append(digit);
      }
      return result.toString();
   }

   private static boolean present(String s, Map<String, Integer> charMap) {
      if (charMap.containsKey(s)) {
         return true;
      }
      return false;
   }

   private static String getDigitWord(int i) {
      if (i == 0) {
         return "ZERO";
      }

      if (i == 1) {
         return "ONE";
      }

      if (i == 2) {
         return "TWO";
      }

      if (i == 3) {
         return "THREE";
      }

      if (i == 4) {
         return "FOUR";
      }

      if (i == 5) {
         return "FIVE";
      }

      if (i == 6) {
         return "SIX";
      }

      if (i == 7) {
         return "SEVEN";
      }

      if (i == 8) {
         return "EIGHT";
      }

      if (i == 9) {
         return "NINE";
      }

      return "";
   }

   private static void createDigitMap() {
      for (int i = 0; i < 10; i++) {
         digitMaps.put(i, createDictionary(i));
      }
   }

   private static List<String> createDictionary(int num) {
      List<String> temp = new ArrayList<>();
      if (num == 0) {
         temp.add("Z");
         return temp;
      }

      if (num == 2) {
         temp.add("W");
         return temp;
      }

      if (num == 4) {
         temp.add("U");
         return temp;
      }

      if (num == 6) {
         temp.add("X");
         return temp;
      }

      if (num == 8) {
         temp.add("G");
         return temp;
      }

      if (num == 1) {
         temp.add("O");
         return temp;
      }

      if (num == 3) {
         temp.add("T");
         return temp;
      }

      if (num == 5) {
         temp.add("F");
         return temp;
      }

      if (num == 7) {
         temp.add("V");
         return temp;
      }

      if (num == 9) {
         temp.add("I");
         return temp;
      }

      return null;
   }

}
