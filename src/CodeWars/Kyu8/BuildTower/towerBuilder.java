package CodeWars.Kyu8.BuildTower;

public class towerBuilder {
    public static String[] towerBuilder(int nFloors)
    {
        String[] tower = new String[nFloors];
        for (int i = 0; i < nFloors; i++)
            tower[i] = " ".repeat(nFloors - i - 1) + "*".repeat(i * 2 + 1) + " ".repeat(nFloors - i - 1);
        return tower;
    }

    public static void main(String[] args) {
        System.out.println(String.join(",", towerBuilder(7)));
    }
}