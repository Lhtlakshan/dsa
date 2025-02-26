import java.sql.SQLOutput;

public class test {

    public static void main(String[] args) {
        int x = 19;
        System.out.println(((int)28/10));
    }

    public static boolean isHappy(int n) {

        while(n > 1){
            String number = String.valueOf(n);
            int sum = 0;
            for(int i=0 ; i < number.length(); i++){
                int j = Integer.parseInt(number.charAt(i) + "");
                sum += Math.pow(j,2);
            }
            n = sum;

            if(sum == 1){
                return true;
            }
        }

        return false;
    }
}
