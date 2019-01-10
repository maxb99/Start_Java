package Task2;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Даны три числа: 4, 6, 8.");
        int a = 4;
        int b = 6;
        int c = 8;
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

