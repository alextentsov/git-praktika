import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sum;
        double mul;
        double div;
        double sub;

        System.out.println("Введите первое число: ");
        double a = new Scanner(System.in).nextInt();

        System.out.println("Введите второе число: ");
        double b = new Scanner(System.in).nextInt();

        sum = a + b;
        sub = a - b;
        mul = a * b;
        div = a / b;

        System.out.println("Калькулятор\n");
        System.out.println("Результат сложения чисел: " + sum);
        System.out.println("Результат вычитания чисел: " + sub);
        System.out.println("Результат перемножения чисел: " + mul);

        if (b == 0) {
            System.out.println("Деление на 0");
        } else {
            System.out.println("Результат деления чисел: " + div);
        }
    }
}
 