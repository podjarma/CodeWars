package CodeWars.Kyu5.NotVerySecure;

public class SecureTester {
    public static boolean alphanumeric(String s){
        return s.matches("^[A-Za-z0-9]+$");
        
    }

    public static void main(String[] args) {
        System.out.println(SecureTester.alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));

        System.out.println(SecureTester.alphanumeric("emoji\uD83D\uDE0A"));


    }
}
