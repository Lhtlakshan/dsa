package javacoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaCoding2 {

    public static void main(String[] args) {

    }

    // 11) Java program to find all permutations of a given string
    public static List<String> permutation(String str){
        List<String> list= new ArrayList<>();
        permute(str,"",list);
        return list;
    }

    public static void permute (String str, String prefix, List<String> ans){
        if(str.isEmpty()){
            ans.add(prefix);
            return;
        }

        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            String remain = str.substring(0,i) + str.substring(i+1);
            permute(remain, prefix+ch, ans);
        }
    }

    // 12) Java program to find if a string is Palindrome
    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // 13) check 2 strings are anagrams
    public static boolean isAnagram(String str1, String str2){
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length() != str1.length()) return false;

        int[] count = new int[26];

        for (char ch: str1.toCharArray()){
            count[ch - 'a']++;
        }

        for (char ch: str2.toCharArray()){
            count[ch - 'a']--;
        }

        for (int c: count){
            if(c != 0) return false;
        }

        return true;
    }

    // 14) Java program to Count Vowels and Consonants in a given string
    public static void countVowelsAndConstant(String str){
        int vowelCount = 0;
        int consonantCount = 0;

        str = str.toLowerCase();

        for(char ch: str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowelCount++;
                }else{
                    consonantCount++;
                }
            }
        }

        System.out.println("No of vowels = " + vowelCount);
        System.out.println("No of consonants = " + consonantCount);
    }


//   15) Java program to print unique characters

    public static void uniqueChars(String str){
        Set<Character> charSet = new HashSet<>();

        for(char ch: str.toCharArray()){
            charSet.add(ch);
        }

        charSet.forEach(ch->{
            System.out.print(ch+" ");
        });
    }

    public static void uniqueCharsWithoutSets(String str) {
        boolean[] unique = new boolean[128];

        for(int i = 0; i<str.length();i++){
            char ch  = str.charAt(i);

            if(!unique[ch]){
                unique[ch] = true;
                System.out.print(ch + " ");
            }
        }
    }

}
