package Task8;

public class Task8 {
    public static void main(String args[]) {
        int i = 748; // Целые
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }

        System.out.println("Сумма всех цифр числа: " + sum);
    }
}
