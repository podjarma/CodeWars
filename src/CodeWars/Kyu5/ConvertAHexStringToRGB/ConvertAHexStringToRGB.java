package CodeWars.Kyu5.ConvertAHexStringToRGB;

import java.awt.*;
import java.util.HashMap;

public class ConvertAHexStringToRGB {

    public static HashMap<String, Integer> hexStringToRGB(String hex) {

        // hex -> {r, g, b}

        Color s = Color.decode(hex);
        HashMap<String, Integer> rgb = new HashMap<>();
        rgb.put("r", s.getRed());
        rgb.put("g", s.getGreen());
        rgb.put("b", s.getBlue());

        return rgb;
    }

    public static void main(String[] args) {
        hexStringToRGB("#FFFFFF");
    }
}
