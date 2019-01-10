package Task2;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Даны три числа: 2, 4, 6.");
        int a = 64;
        int b = 43;
        int c = 77;
        int sum = 0;
        if ((a > b) && (b > c)) {
            sum = a + b;
            System.out.println("Сумма двух наибольших: " + sum);
        } else if ((a > b) && (b < c)) {
            sum = a + c;
            System.out.println("Сумма двух наибольших: " + sum);
        } else if ((a < b) && (c > a)) {
            sum = c + b;
            System.out.println("Сумма двух наибольших: " + sum);
        }
    }
}

