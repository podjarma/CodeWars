package CodeWars.Kyu6.StopgninnipSMysdroW;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpinWords {

    public static String spinWords(String sentence) {
        String output = new String();
        String [] s = sentence.split(" ");

        for(String current: s){
            System.out.println(current);
            if(current.length() >= 5){
                current = new StringBuilder(current).reverse().toString();
            }
            output += current + " ";
        }
        return output.trim();
    }


    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
    }
}