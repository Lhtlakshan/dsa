package recurrence.subset;

import java.util.*;

public class Subsets {

    public static void main(String[] args) {

        Integer[] arr = {1,2,2,2,2,3,4,4,4,5,5,6,6,7,8};

        Set<Integer> set = new HashSet<>();
        for (Integer i: arr) {
            set.add(i);
        }

        System.out.println(set);
        //subSet("","lak");
//        System.out.println(subSetList("","lk"));
//
//        System.out.println(subSetList(new int[]{1,2,3}));


    }

    public static void subSet(String up, String p){

        if(p.isEmpty()){
            System.out.println(up);
            return;
        }

        subSet(up + p.charAt(0), p.substring(1));
        subSet(up,p.substring(1));
    }

    public static List<String> subSetList(String up, String p){
        if(p.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }

        List<String> list1 = new ArrayList<>(subSetList(up+p.charAt(0),p.substring(1))); //taking something
        List<String> list2 = new ArrayList<>(subSetList(up,p.substring(1))); //ignoring something

        list1.addAll(list2);
        return list1;
    }

    public static List<List<Integer>> subSetList(int[] arr){ //this for iteration
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num: arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

}
