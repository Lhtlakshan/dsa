package recurrence.strings;

import java.util.ArrayList;
import java.util.List;

public class StringQuestions {
    public static void main(String[] args) {
       // subSeq("","abc");
//        List<List<Integer>> list = getAllSubSets(new int[]{1, 5, 2, 3});
//        for (List<Integer> i: list){
//            System.out.println(i);
//        }


        String a = "saman";
        Character ch = '1';
        char c = ch;
        Character c2 = c;
        System.out.println(removeLetter("",a));

        System.out.println(Math.sqrt(16));;
    }

    //remove letter in from string
    public static String removeLetter(String p,String up){
        if(up.isEmpty()){
            return p;
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
            return removeLetter(p,up.substring(1));
        }else{
            return removeLetter(p+ch,up.substring(1));
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
