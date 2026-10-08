import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Science", 80);
        map.put("Math", 85);
        map.put("Computer", 90);

        System.out.println(map.get("Computer"));

        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}
