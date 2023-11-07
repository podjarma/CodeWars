package CodeWars.Kyu6.DetectPangram;

public class PangramChecker {
    public boolean check(String sentence){
        char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int counter = 0;
        String govno = new String();
        for (char c: alphabet){
            if(sentence.toLowerCase().indexOf(c) != -1 && govno.indexOf(c) == -1){
                counter++;
                govno += c;
            }
        }
        if(counter == 26){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PangramChecker pc = new PangramChecker();

        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        System.out.println(pc.check(pangram1));

        String pangram2 = "You shall not pass!";
        System.out.println(pc.check(pangram2));
    }
}
