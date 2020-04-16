package com.epam.cdp.java_testng.anastasiia_udovychenko.task1;

import java.util.*;

public class WorkWithStrings {

    Map<Integer,String> myListOfString = new TreeMap<>();

    public void outputShortestAndLongestString() {
        for (int i = 0; i <5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter string");
            String str = scanner.nextLine();
            int length = str.length();
            myListOfString.put(length,str);
        }
        int maxValueInMap=(Collections.max(myListOfString.keySet()));
        int minValueInMap=(Collections.min(myListOfString.keySet()));
        System.out.println(myListOfString);
        System.out.println("The shortest string is: " + myListOfString.get(minValueInMap));
        System.out.println("The longest string is: " + myListOfString.get(maxValueInMap));
    }
}
