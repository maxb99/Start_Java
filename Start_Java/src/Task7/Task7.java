package Task7;

public class Task7 {
    public static void main(String[] args) {
        int a = 1;
        int b = 8;
        for (int i = a, count = 1; i <= b; i++, count++) {
            for (int j = 0; j < count; j++) System.out.print(i);
        }
    }
}
