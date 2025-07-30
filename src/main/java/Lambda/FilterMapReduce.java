package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterMapReduce {

    public static void main(String[] args) {
        int[] a = {4,6,10};
        int is = Arrays.stream(a).reduce(0,(q,r)->q+r);
        System.out.println(is);

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Stream<Integer> s = list.stream()
                .filter(n->n%2==0)
                .map(x->x*2);

        s.forEach(v-> System.out.println(v)); // 4,8,12

        int x = list.stream()
                .filter(n->n%2==0)
                .map(y->y*2)
                .reduce(2,(t,r)->r*t);

        System.out.println(x); // 768
    }
}
