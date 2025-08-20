package hafta3_patika_practices;

import java.util.HashMap;
import java.util.Map;

public class MapPrinter {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Ali", 85);
        studentScores.put("Ayse", 92);
        studentScores.put("Mehmet", 78);
        studentScores.put("Zeynep", 90);
        studentScores.put("Burak", 88);

        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
