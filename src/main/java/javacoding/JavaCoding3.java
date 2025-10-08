package javacoding;

import java.util.Arrays;

public class JavaCoding3 {

    public static void main(String[] args) {
        swapTwoStrings("saman", "nimal");
        System.out.println(getStrWithCharCount("Thilina"));
        separateAlphaAndNumeric("String123");
    }

    // 16 print even indexed characters
    public static void printEvenIndexedChars(String str){

        for (int i = 0; i < str.length(); i++) {
            if(1 %2 == 0){
                System.out.println(str.charAt(i));
            }
        }
    }


    // 17 remove spaces from a string
    public static String removeSpaces(String str){

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                stringBuilder.append(str.charAt(i));
            }

        }
        return stringBuilder.toString();
    }


    // 18 swap 2 strings without 3rd variable
    public static void swapTwoStrings(String str1, String str2){
        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("after swap str1 = "+ str1);
        System.out.println("after swap str2 = "+ str2);
    }

    // 19 get characters count
    public static String getStrWithCharCount(String str) {

        // before that sort the string
        char[] chArr = str.toCharArray();
        Arrays.sort(chArr);
        String strSort = new String(chArr);

        int count = 1;

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < strSort.length(); i++) {
            if(i+1 < strSort.length() && strSort.charAt(i) == strSort.charAt(i+1)){
                count++;
            }else{
                stringBuilder.append(strSort.charAt(i)).append(count);
                count =1;
            }
        }

        return stringBuilder.toString();
    }

    // 17 separate string part and number part
    public static void separateAlphaAndNumeric(String input){
        StringBuilder alphaPart = new StringBuilder();
        StringBuilder numericPart = new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isLetter(ch)){
                alphaPart.append(ch);
            } else if (Character.isDigit(ch)) {
                numericPart.append(ch);
            }
        }

        System.out.println("Output in Alpha: "+alphaPart.toString());
        System.out.println("Output in Numeric: "+ numericPart.toString());
    }

}