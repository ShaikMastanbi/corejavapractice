package basicprograms;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralConverter {
   /* public static String createShortNumeral(String str) {
        // Define the Roman numeral to integer map
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // Convert Roman numeral string to integer
        int result = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            int current = map.get(str.charAt(i));
            if (i < str.length() - 1 && current < map.get(str.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }

        // Convert integer to the shortest possible Roman numeral string
        StringBuilder res = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) {
            while (result >= values[i]) {
                result -= values[i];
                res.append(symbols[i]);
            }
        }

        return res.toString();
    }*/
   public static String createShortNumeral(String str) {
       Map<Character, Integer> map = new HashMap<Character, Integer>();
       map.put('I', 1);
       map.put('V', 5);
       map.put('L', 50);
       map.put('D', 500);
       map.put('X', 10);
       map.put('C', 100);
       map.put('M', 1000);

       int  result = 0;
       for (int i = str.length() - 1; i >= 0; i--) {
           result += map.get(str.charAt(i));
       }

       String res = "";
       int div = 0;

       if (result >= 1000) {
           div = result / 1000;
           for (int k = 1; k <= div; ++k)
               res = res + 'M';
           result = result % 1000;
       }

       if (result >= 500) {
           div = result / 500;
           for (int k = 1; k <= div; ++k)
               res = res + 'D';
           result = result % 500;
       }

       if (result >= 100) {
           div = result / 100;
           for (int k = 1; k <= div; ++k)
               res = res + 'C';
           result = result % 100;
       }

       if (result >= 50) {
           div = result / 50;
           for (int k = 1; k <= div; ++k)
               res = res + 'L';
           result = result % 50;
       }

       if (result >= 10) {
           div = result / 10;
           for (int k = 1; k <= div; ++k)
               res = res + 'X';
           result = result % 10;
       }

       if (result >= 5) {
           div = result / 5;
           for (int k = 1; k <= div; ++k)
               res = res + 'V';
           result = result % 5;
       }

       if (result > 1) {
           div = result / 1;
           for (int k = 1; k <= div; ++k)
               res = res + 'I';
           result = result % 1;
       }
       return res;
   }



    public static void main(String[] args) {
        // Test cases
        System.out.println(RomanNumeralConverter.createShortNumeral("III")); // Expected output: III
        System.out.println(RomanNumeralConverter.createShortNumeral("IV"));  // Expected output: IV
        System.out.println(RomanNumeralConverter.createShortNumeral("IX"));  // Expected output: IX
        System.out.println(RomanNumeralConverter.createShortNumeral("LVIII")); // Expected output: LVIII
        System.out.println(RomanNumeralConverter.createShortNumeral("MCMXCIV")); // Expected output: MCMXCIV

        // Additional test cases
        System.out.println(RomanNumeralConverter.createShortNumeral("XL"));  // Expected output: XL
        System.out.println(RomanNumeralConverter.createShortNumeral("XC"));  // Expected output: XC
        System.out.println(RomanNumeralConverter.createShortNumeral("CD"));  // Expected output: CD
        System.out.println(RomanNumeralConverter.createShortNumeral("CM"));  // Expected output: CM
    }
}
