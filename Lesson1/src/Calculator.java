import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число(через запятую, поскольку число должно быть дробным):");
        double i = scanner.nextDouble();
        System.out.println("Вести второе число (через запятую, поскольку число должно быть дробным):");
        double c = scanner.nextDouble();
        System.out.println("Выберите необходимую операцию: +, -, *, /");
        String oper = scanner.next();
        double result = 0.0;
        switch (oper) {
            case "сложение":
                result = i + c;
                break;
            case "вычитание":
                result = i - c;
                break;
            case "умножение":
                result = i * c;
                break;
            case "деление":
                result = i + c;
                break;
            default:
                System.out.println("Вы ввели некорректную операцию");
        }
        /**
         * Вывод результата.
         */
        System.out.printf("%.4f", result);
     }


    }

