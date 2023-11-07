package CodeWars.Kyu6.TenMinutesWalk;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        int vert = 0;
        int hor = 0;
        int i = 0;
        if(walk.length == 10){
            while(i < walk.length){
                switch (walk[i]){
                    case 'n':
                        vert += 1;
                        i++;
                        break;
                    case 's':
                        vert -= 1;
                        i++;
                        break;
                    case 'e':
                        hor += 1;
                        i++;
                        break;
                    case 'w':
                        hor -= 1;
                        i++;
                        break;
                }
                System.out.println("Current pos on step " + i + " x: " +  hor + " y: " + vert);
            }
            if (vert == 0 && hor == 0){
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
//        System.out.println(TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
//        System.out.println(TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        System.out.println(TenMinWalk.isValid(new char[] {'n', 'w', 's', 'e'}));
//        System.out.println(TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }
}
