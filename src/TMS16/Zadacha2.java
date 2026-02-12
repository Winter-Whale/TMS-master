package TMS16;

import java.util.HashMap;
import java.util.Map;

public class Zadacha2 {
    public static void main(String[] args) {
        String[] strings = {"moon", "good"};

        Map<String, String> result = new HashMap<>();

        for (String str : strings) {
            String firstChar = str.substring(0, 1);
            String lastChar = str.substring(str.length() - 1);
            result.put(firstChar, lastChar);
        }

        System.out.println(result);
    }
}
