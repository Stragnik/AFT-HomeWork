import java.util.Scanner;

/**
 *      Created by Sergey Smirnov
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Нажмите 1 для вызова калькулятора и 2 для вызова метода, для нахождения максимального слова в массиве: ");
        Scanner scanner = new Scanner(System.in);
        int decision = scanner.nextInt();
        switch (decision){
            case 1:
                Calc calc = new Calc();
                calc.calculate();
                break;
            case 2:
                Array array = new Array();
                System.out.println(array.maxLengthWord());
                break;
        }
    }

}