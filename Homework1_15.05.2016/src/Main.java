/**
 * Created by Fandorin on 15.05.2016.
 */
public class Main {

    public static void main(String[] args) {

        // Выводим на экран картинку кролика

        System.out.println(" (\\_/)");
        System.out.println("(='.'=)");
        System.out.println("(\")(\")");
        System.out.println("\n");

        // Выводим на экран картинку кролика (другой способ)
        System.out.println(" (\\_/)" + "\n" + "(='.'=)" + "\n" + "(\")(\")");
        System.out.println("\n");


        // Решаем линейное уравнение ax + b = 0. Выводим уравнение на экран
        System.out.println("Решите уравнение: " + "ax + b = 0");

        // Создаем переменные a, b. Присваиваем переменным a и b целочисленные значения

        int a = 2;
        int b = 4;

        // выводим значения переменных на экран
        System.out.println("a = 2" + "\n" + "b = 4");
        System.out.println("\n");

        // Создаем переменную x и вычисляем ее значение

        int x = (-b)/a;

        // Выводим решение уравнения на экран

        System.out.println("Решение уравнения: " + "x = " + "-b / a " + "= " + x);
    }

}
