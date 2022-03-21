import expression.EveryExpression;
import expression.exceptions.ExpressionParser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите выражение, где неизвестными могут быть x, y, z");
        String string = in.nextLine();

        EveryExpression expression = new ExpressionParser().parse(string);
        System.out.println("Выражение распарсилось так");
        System.out.println(expression.toMiniString());


        System.out.println("Введите x, y, and z");
        System.out.println("Если какая-то перемення не используется, напишите 0");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        System.out.println("При подстановке переменных в выражение получилось: " + expression.evaluate(x, y, z));
    }
}
