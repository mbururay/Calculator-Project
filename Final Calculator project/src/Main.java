import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Main {
    public static void main(String[] args) {
        // The expression as a string
        String expression = "1+2/3";

        // Build and evaluate the expression
        Expression exp = new ExpressionBuilder(expression).build();
        double result = exp.evaluate();

        System.out.println("Result: " + result);
    }
}
