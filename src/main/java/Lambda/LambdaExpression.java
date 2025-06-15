package Lambda;

public class LambdaExpression {
    Operation sum = (a,b)-> a+b;
    Operation mul = (a,b)-> a*b;

    public static void main(String[] args) {
        LambdaExpression l = new LambdaExpression();
        System.out.println(l.sum.operation(5,6));
    }

}

interface Operation{
    int operation(int a, int b);
}
