package CodeWars.FakeBinary;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        char [] chars = numberString.toCharArray();
        String s = new String();
        for (char i: chars){
            if(Character.getNumericValue(i) >= 5){
                s += 1;
            }
            else{
                s += 0;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(fakeBin("45385593107843568"));
    }
}