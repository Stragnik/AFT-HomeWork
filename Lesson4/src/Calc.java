import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        System.out.println("В калькуляторе доступны следующие операции:");
        System.out.println("для сложения введите - '+',");
        System.out.println("для вычитания введите - '-',");
        System.out.println("для умножения введите - '*',");
        System.out.println("для деления введите - '/'.");

        Scanner scanner = new Scanner(System.in);
        boolean is_next_operation = false;

        do {
            System.out.print("Выберите операцию: ");
            String operation = scanner.next();

            switch (operation) {
                case "+":
                    addition(scanner);
                    break;
                case "-":
                    subtraction(scanner);
                    break;
                case "*":
                    multiplication(scanner);
                    break;
                case "/":
                    division(scanner);
                    break;
                default:
                    System.out.println("Не знаю такой операции :)");
                    break;
            }

            System.out.println("\nТребуется ли ещё одна операция? (Y/N) ");
            String is_next_operation_str = scanner.next();

            is_next_operation = (is_next_operation_str.equals("y"));
        } while (is_next_operation);
        scanner.close();
    }


    private static float[] scanner2Float(Scanner scanner) {
        float[] numbers = new float[2];
        System.out.println("Введите первое число: ");
        numbers[0] = scanner.nextFloat();
        System.out.println("Введите второе число: ");
        numbers[1] = scanner.nextFloat();
        return numbers;
    }

    private static void addition(Scanner scanner) {
        System.out.println("Выбрана операция сложение.");
        float[] ab = scanner2Float(scanner);

        System.out.printf("Результат: %.4f\n", ab[0] + ab[1]);
    }


    private static void subtraction(Scanner scanner) {
        System.out.println("Выбрана операция вычитание.");
        float[] ab = scanner2Float(scanner);

        System.out.printf("Результат: %.4f\n", ab[0] - ab[1]);
    }


    private static void multiplication(Scanner scanner) {
        System.out.println("Выбрана операция умножение.");
        float[] ab = scanner2Float(scanner);

        System.out.printf("Результат: %.4f\n", ab[0] * ab[1]);
    }


    private static void division(Scanner scanner) {
        System.out.println("Выбрана операция деление.");
        float[] ab = scanner2Float(scanner);

        if (ab[1] == 0.0) {
            System.out.println("Деление не возможно, так как второй операнд равен 0.");
        } else {
            System.out.printf("Результат: %.4f\n", ab[0] / ab[1]);
        }
    }
}
