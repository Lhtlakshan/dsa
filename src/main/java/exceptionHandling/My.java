package exceptionHandling;

public class My {

    public static void main(String[] args) {


        String str = "fkjdn";

        int end = str.length();
        char[] strt =  str.toCharArray();
        for(int i=0; i < str.length()/2; i++){
            char x = strt[i];
            strt[i] = strt[end-i-1];
            strt[end-i-1] = x;
        }

        System.out.println(String.copyValueOf(strt));

    }
}
