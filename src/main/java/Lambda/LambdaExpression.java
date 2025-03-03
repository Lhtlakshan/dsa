package Lambda;

public class LambdaExpression {
    Operation sum = (a,b)-> a+b;
    Operation mul = (a,b)-> a*b;

    public static void main(String[] args) {

    }

}

interface Operation{
    int operation(int a, int b);
}
