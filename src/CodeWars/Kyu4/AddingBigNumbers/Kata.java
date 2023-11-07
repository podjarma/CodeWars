package CodeWars.Kyu4.AddingBigNumbers;

import java.math.BigInteger;

public class Kata {

    //TODO Непобедимая херня, есть удобное решение, но бля
    public static String add(String a, String b) {
        return String.valueOf(new BigInteger(a).add(new BigInteger(b)));
    }

//    Удобное хорошее решение
//    public static String add(String a, String b) {
//        return String.valueOf(new BigInteger(a).add(new BigInteger(b)));
//    }

    public static void main(String[] args) {
        System.out.println(add("63829983432984289347293874", "90938498237058927340892374089"));
    }

}