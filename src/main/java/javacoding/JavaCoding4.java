package javacoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaCoding4 {

    public static void main(String[] args) {
        System.out.println(getLongestSubSequenceLength("Samankamalkamalkamalkamalweibuwhb"));
    }


    // 21 lowercase and uppercase printing
    //Java program to gives two Output:“abcde”, “ABCDE” for the Input String Str = “aBACbcEDed”
    public static List<String> getLowerUpperStrings(String str){
        StringBuilder strUpper = new StringBuilder();
        StringBuilder strLower = new StringBuilder();

        for (char ch: str.toCharArray()) {
            if(Character.isUpperCase(ch)) {
                strUpper.append(ch);
            } else if (Character.isLowerCase(ch)) {
                strLower.append(ch);
            }
        }

        List<String> strList = Arrays.asList(strLower.toString(), strUpper.toString());
        return strList;
    }


    //Java program to find the longest without repeating characters

    public static int getLongestSubSequenceLength(String str){
        Set<Character> charSet = new HashSet<>();
        int start = 0;
        int end = 0;
        int maxLength = 0;

        while(end < str.length()){

            Character currentChar = str.charAt(end);
            if(!charSet.contains(currentChar)){
                charSet.add(currentChar);
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            }else{
                charSet.remove(currentChar);
                start++;
            }
        }

        return maxLength;
    }


    // remove dupli
}
