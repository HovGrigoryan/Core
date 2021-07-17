package interview.dublicate;

import java.util.HashMap;
import java.util.Map;

public class Exercise {

    public static void main(String[] args) {
        findDublicate("PPoxosv");

    }

    private static void findDublicate(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] array = s.toCharArray();
        for (Character character : array) {
            if (map.containsKey(character)) {
            map.put(character,map.get(character) + 1);
            } else {
                map.put(character, 1);
            }

        }
        for (Character character:array){
        if (map.get(character) == 2){
            System.out.println(character);

            }
        }
//        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
//            System.out.print(characterIntegerEntry.getKey().toString() + characterIntegerEntry.getValue().toString());
//            System.out.println();
//        }
    }
}


