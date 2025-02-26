package maths;

public class Sqrt {

    public static void main(String[] args) {
        System.out.println(sqrt(40,4));

    }

    static double sqrt(int num , int point){
        int s = 0;
        int e = num;

        double root = 0.0;
        while(s <= e){
            int m = s + (e-s)/2;

            if(m * m == num){
                return m;
            }
            if(m*m < num){
                s = m+1;
            }else{
                e = m-1;
            }
        }

        double inc = 0.1;
        for (int i = 0; i < point; i++) {
            while (root * root <= num){
                root += inc;
            }
            root -= inc;
            inc /= 10;
        }
        return root;
    }
}
