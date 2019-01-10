package Task5;

public class Task5 {
    public static void main(String[] args) {
        int a = 4;
        int b = 16;
        int sum = 0;
        for (int i = a; i<=b;i++) {
            sum = sum + i;
        }
        System.out.println("Сумма всех целых чисел: " + sum);
    }
}
