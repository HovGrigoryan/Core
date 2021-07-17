package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<String, User> userMap = new HashMap<>();
        User user = new User("Poxos", "Poxosyan", "484545", "poxos@mail.com", 20);
        userMap.put(user.email, user);
        User user1 = userMap.get("poxos@mail.com");
        System.out.println(user1);


        Map<String, User> userTreeMap = new TreeMap<>();
        userTreeMap.put("1", user);

        Map<String, User> linkedHashMap = new LinkedHashMap<>();

    }
}
