package com.epam.cdp.java_testng.anastasiia_udovychenko.task1;

import java.util.*;

public class WorkWithStrings {

    Map<Integer,List<String>> myListOfString = new HashMap<>();
    List<String> myListOfString2 = new ArrayList<>();

    public List<String> inputStringsFromConsole()
    {
        int stringsQuantity = 5;
        for (int i = 0; i < stringsQuantity; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter string");
            String str = scanner.nextLine();
            myListOfString2.add(str);
        }
        return myListOfString2;
    }

    public void outputLongerThanAverage()
    {
        List<String> myList = inputStringsFromConsole();
        int strLength = 0;
        for (String str : myList){
            strLength += str.length();
        }
        int averageLength = strLength/myList.size();
        for (String str: myList)
        {
            if (str.length() > averageLength)
            {
                System.out.println(str + " is/are longer than average");
            }
        }
    }

    public void outputShorterThanAverage()
    {
        List<String> myList = inputStringsFromConsole();
        int strLength = 0;
        for (String str : myList){
            strLength += str.length();
        }
        int averageLength = strLength/myList.size();
        for (String str: myList)
        {
            if (str.length() < averageLength)
            {
                System.out.println(str + " is/are shorter than average");
            }
        }
    }

    public void minimalDiversityOfCharacters()
    {
        List<String> myList = inputStringsFromConsole();
        int longestCount = 0;
        for (String str: myList)
        {
            boolean[] isItThere = new boolean[Character.MAX_VALUE];
            for (int i = 0; i < str.length(); i++)
            {
                isItThere[str.charAt(i)] = true;
            }

            int count = 0;
            for (int i = 0; i < isItThere.length; i++)
            {
                if (isItThere[i] == true)
                {
                    count++;
                }
            }
            if (count > longestCount)
            {
                longestCount = count;
            }
            myListOfString.computeIfAbsent(longestCount, k -> new ArrayList<>()).add(String.valueOf(myList.indexOf(str)));
            //myListOfString.computeIfAbsent(longestCount, k -> new ArrayList<>()).add(myList.indexOf(st));
            //return count;
        }
       // myListOfString.computeIfAbsent(longestCount, k -> new ArrayList<>()).add(myList.indexOf(str));

    }

    public void outputShortestAndLongestString()
    {
        for (int i = 0; i <5; i++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter string");
            String str = scanner.nextLine();
            int length = str.length();
            myListOfString.computeIfAbsent(length, k -> new ArrayList<>()).add(str);
        }
        int maxValueInMap=(Collections.max(myListOfString.keySet()));
        int minValueInMap=(Collections.min(myListOfString.keySet()));
        System.out.println(myListOfString);
        System.out.println("The shortest string is/are: " + myListOfString.get(minValueInMap));
        System.out.println("The longest string is/are: " + myListOfString.get(maxValueInMap));
    }

    public void onlyStringsThatContainsNumbersRegEx()
    {
        List<String> myList = inputStringsFromConsole();
        for (String str: myList)
        {
            if (str.contains("[0-9]+")) //or .contains("[0-9]+")
            {
                System.out.println(str);
            }
        }
    }

    public void onlyStringsThatContainsNumbers() {
        List<String> myList = inputStringsFromConsole();
        for (String str : myList)
        {
            if (isNumeric(str))
            {
            System.out.println(str);
            }
        }
    }
    public boolean isNumeric(String str)
    {
        if (str == null) {
            return false;
        }
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
