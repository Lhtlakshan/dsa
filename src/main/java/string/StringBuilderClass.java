package string;

public class StringBuilderClass {
    public static void main(String[] args) {
        String str = "This1 a3 is2 book4";

        System.out.println(sortSentence(str));

        System.out.println(isPalindrome("abba"));;

    }

    static public String sortSentence(String s) {
        String[] strArr = s.split(" ");
        String[] strArr2 = new String[strArr.length];
        String newString = "";

        int i = 0;

        for (String strEle: strArr){
            i = (int)(strEle.charAt(strEle.length() - 1) - '0');
            strArr2[i-1] = strEle.substring(0,strEle.length() - 1);
        }

        for (String str:strArr2) {
            newString += str + " ";
        }

        return newString;
    }

    void fun(){
        System.out.println("fun");
    }

    static boolean isPalindrome(String str){
        String str2 = str.toLowerCase();
        StringBuilder sb = new StringBuilder(str2);

        return str2.equals(sb.reverse().toString()) ? true : false;
    }

}
