package CodeWars.JadenCasingStrings;

public class JadenCase {

    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if(phrase != null){
            if(!phrase.isEmpty()) {
                char[] chars = phrase.toCharArray();
                for (int i = 0; i < chars.length - 1; i++) {
                    if (i == 0 || chars[i-1] == ' ') {
                        chars[i] = Character.toUpperCase(chars[i]);
                    }
                }
                return new String(chars);
            }
        }
        return null;
    }
//    "most trees are blue"
    public static void main(String[] args) {
        System.out.println(toJadenCase("most trees are blue"));
    }

}
