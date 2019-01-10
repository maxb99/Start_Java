package Task1;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Даны три числа: 4, 6, 8.");
        int a = 4;
        int b = 6;
        int c = 8;
        int min = 0;
        int max = 0;
        if ((a > b) && (a > c)) {
            max = a;
        } else if ((b > a) && (b > c)) {
            max = b;
        } else if ((c > a) && (c > a)) {
            max = c;
        }
        if ((a < b) && (a < c)) {
            min = a;
        } else if ((b < a) && (b < c)) {
            min = b;
        } else if ((c < a) && (c < a)) {
            min = c;
        }
        System.out.println("Минимальное число:" + min);
        System.out.println("Максимальное число:" + max);

    }
}
