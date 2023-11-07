package CodeWars.Kyu5.CountIPAddresses;

public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        return convertToLong(end) - convertToLong(start);
    }

    private static long convertToLong(String ip) {
        long result = 0;
        for (String s : ip.split("[.]") )
            result = result * 256 + Long.parseLong(s);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ipsBetween("10.0.0.0", "10.0.0.50"));
    }
}
