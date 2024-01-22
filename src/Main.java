public class Main {
    public static void main(String[] args) {

        double sum;
        double mul;
        double div;
        double sub;
        double a = 2;
        double b = 3;

        mul = a * b;
        sum = a + b;
        div = (a / b);
        sub = a - b;

        System.out.println("Калькулятор");
        System.out.println("Результат перемножения чисел:" + mul);
        System.out.println("Результат сложения чисел:" + sum);
        System.out.println("Результат деления чисел:" + div);
        System.out.println("Результат вычитания чисел:" + sub);
    }
}
