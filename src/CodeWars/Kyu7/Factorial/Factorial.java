package CodeWars.Kyu7.Factorial;

public class Factorial {
    public static int factorial(int n) {
        if(n < 0 | n > 11) {
            throw new IllegalArgumentException();
        }
        else {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
}
