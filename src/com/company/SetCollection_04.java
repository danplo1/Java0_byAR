package com.company;

import java.util.*;

/**
 * Created by Daniel_D'AGE on 11.10.2018.'
 * Kolekcja Set - nie pozwala umieszczac dublikatów - np. dwa razy tego samego obiektu
 */
public class SetCollection_04 {
    public static void main(String[] args) {

        /*Set<String>stringSet =new HashSet<>();

         stringSet.add("jeden");
         stringSet.add("dwa");
         stringSet.add("trzy");

         stringSet.add("jeden");
         stringSet.add("cztery");
         stringSet.add("dwa");

         for(String s: stringSet){
         System.out.println(s);
         }
         */

        Set<Integer> setStr = new HashSet<>();
        Random random = new Random();

        while (setStr.size() < 6) {
            int x = random.nextInt(36) + 1;

            System.out.println("Wylosowano następujące liczby:" + x);
            setStr.add(x);

            for (Integer i : setStr) {
                System.out.println(i);
            }
            List<Integer> integerList = new ArrayList<>();
            integerList.addAll(setStr);

            System.out.println("Lista:" );
            for (int i = 0; i <integerList.size() ; i++) {
                System.out.println(integerList.get(i));

            }

        }
    }
}
