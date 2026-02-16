import java.util.Scanner;
import java.util.Stack;
import service.InfixToPostfixConverter;
import service.PostfixEvaluator;

public class main {

    public static main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione implementación:");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Lista");

        int option = sc.nextInt();
        int listOption = 0;

        if (option == 3) {
            System.out.println("1. Simple");
            System.out.println("2. Doble");
            listOption = sc.nextInt();
        }

        Stack<Character> stackChar =
                StackFactory.createStack(option, listOption);

        Stack<Double> stackDouble =
                StackFactory.createStack(option, listOption);

        String expression =
                FileReaderUtil.readExpression("datos.txt");

        InfixToPostfixConverter converter =
                new InfixToPostfixConverter();

        String postfix =
                converter.convert(expression, stackChar);

        PostfixEvaluator evaluator =
                new PostfixEvaluator();

        double result =
                evaluator.evaluate(postfix, stackDouble);

        System.out.println("Postfix: " + postfix);
        System.out.println("Resultado: " + result);
    }
}
