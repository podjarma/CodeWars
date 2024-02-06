package CodeWars.Kyu6.NotSoRandom;

import java.util.ArrayList;
import java.util.Random;

class NotSoRandom {
    //это я конечно гений
    public static String NotSoRandomV1(int b, int w) {
        ArrayList <String> hat = new ArrayList<String>();
        for(int i = 0; i < b; i++){
            hat.add("Black");
        }
        for(int i = 0; i < w; i++){
            hat.add("White");
        }
        while(hat.size() != 1){
            int r1;
            int r2;
            do{
                r1 = (new Random()).ints(0,hat.size()-1).iterator().nextInt();
                r2 = (new Random()).ints(0,hat.size()-1).iterator().nextInt();
                if(hat.size() == 2){
                    r1 = 0;
                    r2 = 1;
                    break;
                }
            }
            while(r1 == r2);

            String ball1 = hat.get(r1);
            String ball2 = hat.get(r2);

            if (ball1.equals(ball2)){
                hat.remove(r1);
                if (r1 < r2){
                    r2 = r2 - 1;
                }
                hat.remove(r2);
                hat.add("White");
            }else{
                hat.remove(r1);
                if (r1 < r2){
                    r2 = r2 - 1;
                }
                hat.remove(r2);
                hat.add("Black");
            }
        }

        return hat.get(0);
    }
    public static String NotSoRandom(int b, int w) {
        return b % 2 == 0 ? "White" : "Black";
    }


    public static void main(String[] args) {
        System.out.println(NotSoRandom(2, 1));
    }
}