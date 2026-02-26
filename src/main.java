import java.util.Scanner;
import factory.StackFactory;
import Stack.stack;
import service.InfixToPostfixConverter;
import service.PostfixEvaluator;
import util.FileReaderUtil;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione implementación del Stack:");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Lista");

        int option = scanner.nextInt();
        int listOption = 0;

        if (option == 3) {
            System.out.println("1. Simple");
            System.out.println("2. Doble");
            listOption = scanner.nextInt();
        }

        stack<Character> stackChar =
                StackFactory.createStack(option, listOption);

        stack<Double> stackDouble =
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

        System.out.println("\nPostfix: " + postfix);
        System.out.println("Resultado: " + result);

        scanner.close();
    }
}
