package CodeWars.YouAreSquare;

public class Square {
    public static boolean isSquare(int n) {
        if(n < 0){
            return false;
        }
        if(Math.ceil(Math.sqrt(n)) != Math.floor(Math.sqrt(n))){
            return false;
        }
        return true; // fix me!
    }

    public static void main(String[] args) {

        System.out.println(Square.isSquare(3));
        System.out.println(Square.isSquare(26));
        System.out.println(Square.isSquare(25));
//        System.out.println(Math.ceil(Math.sqrt(25)) == Math.floor(Math.sqrt(25)));
    }
}
