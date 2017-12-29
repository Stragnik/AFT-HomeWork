import java.util.Scanner;

/**
 * Created by Sergey Smirnov
 */

public class Calc {


    public void calculate () {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Введите первое число:");
            // first number
            float firstNumber = scanner.nextFloat();

            System.out.println("Введите второе значение:");

            // second number
            float secondNumber = scanner.nextFloat();

            System.out.println("Выбирете операцию  (+,-,*,/): ");
            char op = scanner.next().charAt(0);
            switch (op) {
                case '+':
                    //сложение
                    System.out.printf("Sum: %.4f\n", sum(firstNumber, secondNumber));
                    break;
                case '-':
                    //вычитание
                    System.out.printf("Div: %.4f\n", div(firstNumber, secondNumber));
                    break;
                case '*':
                    //умножение
                    System.out.printf("Mult: %.4f\n", mult(firstNumber, secondNumber));
                    break;
                case '/':
                    //деление
                    System.out.printf("Quot: %.4f\n", quotient(firstNumber, secondNumber));
                    break;
                default:
                    //результат
                    System.out.printf("Sum: %.4f\n", sum(firstNumber, secondNumber));
                    break;
            }
            System.out.println("Завершить программу (1/0)");
            int answer = scanner.nextInt();
            switch (answer) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    flag = true;
                    break;
                default:
                    flag = true;
                    break;
            }
        }
    }

    private static float sum (float a, float b){
        return a + b;
    }


    private static float div (float a, float b) {
        return a - b;
    }


    private static float mult (float a, float b){
        return a * b;
    }


    private static float quotient (float a, float b){
        return a / b;
    }
}