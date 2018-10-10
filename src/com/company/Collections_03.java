package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Daniel_D'AGE on 10.10.2018.
 * Kolekcje by AR #03
 */
public class Collections_03 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("jeden");
        stringList.add("dwa");
        stringList.add("trzy");

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        System.out.println(stringList.size());

        stringList.add(1, "zero");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        System.out.println(stringList.size());

        stringList.remove(1);
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        System.out.println(stringList.size());

        System.out.println(stringList.contains("dwa"));
        System.out.println(stringList.contains("zero"));
        System.out.println(stringList.indexOf("trzy"));


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "jeden");
        map.put(2, "dwa");
        map.put(3, "trzy");

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            int key = m.getKey();
            String value = m.getValue();
            System.out.println(key + " : " + value);
        }

        System.out.println(map.containsValue("jeden"));
        System.out.println(map.get(2));
        System.out.println(map.values());
        map.clear();

    }

}







