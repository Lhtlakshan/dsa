package recurrence.subset;

public class Permutation {

    public static void main(String[] args) {
        permutation("","thi");
    }

    public static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            permutation(f+ch+s, up.substring(1));
        }
    }

    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }

        int rem = 0;

        if (x < 0) {
            while (x < 0) {
                rem = rem * 10 + x % 10;
                x /= 10;
            }
        }

        while (x > 0) {
            rem = rem * 10 + x % 10;
            x /= 10;
        }

        return rem;
    }
}