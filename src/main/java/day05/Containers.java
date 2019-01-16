package day05;

import java.util.*;

public class Containers {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();
        // 存
        sets.add("ee");
        sets.add("cc");

        //取
        sets.size();
        for (String set : sets) {
            System.out.println(set);
        }

        Map<String, String> stringStringHashMap = new HashMap<>(16);
        stringStringHashMap.put("s", "snack");
        stringStringHashMap.put("d", "dog");
        Collection<String> values = stringStringHashMap.values();
        for (String value : values) {
            System.out.println(value);
        }

    }
}
