package CodeWars.Kyu8.EvenOrOdd;

public class Kata {
    public static String evenOrOdd(int number) {
        return (number % 2 != 0) ? "Odd" : "Even";  // Place code here;
    }

    public static void main(String[] args) {
        System.out.println(evenOrOdd(3));
    }
}
