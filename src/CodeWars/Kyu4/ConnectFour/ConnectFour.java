package CodeWars.Kyu4.ConnectFour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectFour {
    public static String whoIsWinner(List<String> piecesPositionList) {



        // retrun "Red" or "Yellow" or "Draw"
        return "Draw";
    }

    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>(Arrays.asList(
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "G_Red",
                "B_Yellow"
        ));
        System.out.println(whoIsWinner(myList));
    }
}
