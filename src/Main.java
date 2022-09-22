
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Добро Пожаловать в Калькулятор!");
            System.out.println("Выберите Функцию :");
            System.out.println("1) Сложение (+)");
            System.out.println("2) Вычитание (-)");
            System.out.println("3) Умножение (*)");
            System.out.println("4) Деление (/)");
            System.out.println("5) Завершить Работу");
            Scanner sc = new Scanner(System.in);
            int sc1 = sc.nextInt();
            System.out.println("Введите 1 Число :");
            int a = sc.nextInt();
            System.out.println("Введите 2 Число :");
            int b = sc.nextInt();
            System.out.println("1 Число = " + a);
            System.out.println("2 Число = " + b);
            int res = 0;
            if (sc1 == 1) {
                res = a + b;
            }
            if (sc1 == 2) {
                res = a - b;
            }
            if (sc1 == 3) {
                res = a * b;
            }
            if (sc1 == 4) {
                res = a / b;
            }
            System.out.println("Ответ : " + res);
        } catch (Exception e) {
            System.err.println("Сбой! Не вводи букву!");
        }

    }
}