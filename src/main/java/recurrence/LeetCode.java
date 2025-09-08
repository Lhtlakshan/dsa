package recurrence;

import java.util.ArrayList;
import java.util.List;

public class LeetCode {

    public static void main(String[] args) {
        System.out.println(letterCombinationReturn("","12"));;
    }

    public static void letterCombination(String p, String up){ // 17 => leet

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit -1)*3; i < digit*3; i++) {
            char ch = (char)('a' + i);
            letterCombination(p+ch,up.substring(1));
        }

    }


    //Return as a list

    public static List<String> list = new ArrayList<>();
    public static List<String> letterCombinationReturn(String p, String up){ // 17 => leet

        if(up.isEmpty()){
            list.add(p);
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit -1)*3; i < digit*3; i++) {
            char ch = (char)('a' + i);
            letterCombination(p+ch,up.substring(1));
        }

        return list;
    }
}
