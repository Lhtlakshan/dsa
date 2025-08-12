package recurrence.strings;

import java.util.ArrayList;
import java.util.List;

public class StringQuestions {
    public static void main(String[] args) {
        subSeq("","abc");
        List<List<Integer>> list = getAllSubSets(new int[]{1, 5, 2, 3});
        for (List<Integer> i: list){
            System.out.println(i);
        }
    }

    //remove letter in from string
    public static void removeLetter(String p,String up){
        if(p.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
            removeLetter(p,up.substring(1));
        }else{
            removeLetter(p+ch,up.substring(1));
        }
    }

    public static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeq(p, up.substring(1));
        subSeq(p + ch , up.substring(1));
    }

    public static List<List<Integer>> getAllSubSets(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num: arr){
            int size = outer.size();
            for (int i=0; i<size; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        return outer;
    }
}
