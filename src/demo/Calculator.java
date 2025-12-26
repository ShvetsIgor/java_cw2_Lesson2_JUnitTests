package demo;

public class Calculator {

    public static int sum (int x, int y) {
        return x + y;
    }

    public static int sub (int x, int y) {
        return x - y;
    }

    public static int mul (int x, int y) {
        return x * y;
    }

    public static double div (int x, int y) {

        if (y == 0) {
            return -1;
        }
        return (double) x / y;
    }

    //ToDo сделать тесты, выявить ошибки, и изменить методы чтобы тесты не заваливались на проверках
}
