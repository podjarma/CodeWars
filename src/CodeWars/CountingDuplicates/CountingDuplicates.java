package CodeWars.CountingDuplicates;
/*
Count the number of Duplicates
Write a function that will return the count of distinct case-
insensitive alphabetic characters and numeric digits that occur
more than once in the input string. The input string can be
assumed to contain only alphabets (both uppercase and
lowercase) and numeric digits.
*/

import java.util.HashMap;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        // Write your code here
        char [] chars = text.toLowerCase().toCharArray();
        String s = new String();
        int char_conunter;
        int counter = 0;
        for (int i = 0; i < chars.length-1; i++){
            char_conunter = 0;
            for (int j = 0; j < chars.length; j++){
                if(chars[i] == chars[j]){
                    char_conunter++;
                }
            }

            if(char_conunter > 1 && s.indexOf(chars[i]) == -1){
                counter++;
                s+=chars[i];
            }
        }
        return counter;
    }

    //Не моё решение
    public static int duplicateCount1(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : text.toLowerCase().toCharArray()) {
            map.put(c, map.containsKey(c) ? 1 : 0);
        }
        return (int) map.values().stream().filter(e -> e > 0).count();
    }

    public String reallyLongStringContainingDuplicatesReturnsThree() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;
        return test;
    }

    public static void main(String[] args) {
        CountingDuplicates countingDuplicates = new CountingDuplicates();

        System.out.println(CountingDuplicates.duplicateCount1("adacdfeqa"));
    }

}
