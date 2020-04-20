package com.epam.cdp.java;

import com.epam.cdp.java_testng.anastasiia_udovychenko.task1.Calculator;
import com.epam.cdp.java_testng.anastasiia_udovychenko.task1.TwentyRandomsAlgorithm;
import com.epam.cdp.java_testng.anastasiia_udovychenko.task1.WorkWithStrings;

public class Runner {

    public static void main(String[] args) {

        TwentyRandomsAlgorithm algorithm = new TwentyRandomsAlgorithm();
        //algorithm.swapElements();
        //algorithm.sumOfEvenNumbers();
        //algorithm.replaceNegativeWithZero();
        //algorithm.multiplyByThree();
        //algorithm.differenceBetweenAverageAndMin();
        //algorithm.outputAllDuplicatesWithOddIndex();
        //algorithm.replaceAllOddElementsWIthZero();

        WorkWithStrings strings = new WorkWithStrings();
        //strings.outputShortestAndLongestString();
        //strings.outputLongerThanAverage();
        strings.onlyStringsThatContainsNumbers();

        Calculator calculator = new Calculator();
        calculator.calc();
    }
}
