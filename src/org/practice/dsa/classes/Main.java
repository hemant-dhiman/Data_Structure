package org.practice.dsa.classes;

import java.util.HashMap;

/**
 * @author Hemant Dhiman
 * @since 01/02/24
 */
public class Main {

    public static void main(String[] args) {
         Cookie cookieOne = new Cookie("Green");
         Cookie cookieTwo = new Cookie("Brown");

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());

        HashMap<String, Integer> mapOne = new HashMap<>();
        HashMap<String, Integer> mapTwo = new HashMap<>();
        mapOne.put("value", 11);

        mapTwo = mapOne;

        System.out.println(mapOne);
        System.out.println(mapTwo);

        mapOne.put("value", 22);

        System.out.println(mapOne);
        System.out.println(mapTwo);

        HashMap<String, Integer> mapThree = new HashMap<>();
        mapThree.put("value", 33);

        mapOne = mapThree;
        mapTwo = mapOne;

        System.out.println(mapOne);
        System.out.println(mapTwo);
        System.out.println(mapThree);
    }
}
