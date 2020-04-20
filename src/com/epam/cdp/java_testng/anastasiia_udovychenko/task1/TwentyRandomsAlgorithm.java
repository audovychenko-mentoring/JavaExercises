package com.epam.cdp.java_testng.anastasiia_udovychenko.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class TwentyRandomsAlgorithm {

    public double[] fillArray()
    {
        double[] numbers = new double[20];
        for(int i=0; i<numbers.length; i++)
        {
            Random random = new Random();
            numbers[i] = random.nextInt(20) - 10;
        }
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }

    public void swapElements()
    {
        double[] numbers = fillArray();
        double max = Arrays.stream(numbers)
                .max()
                .getAsDouble();

        double min = Arrays.stream(numbers)
                .min()
                .getAsDouble();

        int indexMax = IntStream.range(0, numbers.length)
                .filter(i -> max == numbers[i])
                .findFirst()
                .orElse(-1);

        int indexMin = IntStream.range(0, numbers.length)
                .filter(i -> min == numbers[i])
                .findFirst()
                .orElse(-1);

        double temp = numbers[indexMax];
        numbers[indexMax] = numbers[indexMin];
        numbers[indexMin] = temp;

        System.out.println(Arrays.toString(numbers));
    }

    public void sumOfEvenNumbers()
    {
        double[] numbers = fillArray();
        double sum = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            if (i % 2 == 0)
            {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }

    public void replaceNegativeWithZero()
    {
        double[] numbers = fillArray();
        for (int i=0; i < numbers.length; i++)
        {
            if (numbers[i] < 0)
            {
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public void multiplyByThree()
    {
        double[] numbers = fillArray();
        for (int i = 0; i < numbers.length - 1; i++)
        {
            if (numbers[i] > 0 && numbers[i+1] < 0)
            {
                numbers[i] *= 3;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public void differenceBetweenAverageAndMin()
    {
        double[] numbers = fillArray();
        Arrays.stream(numbers).sum();
        double average1 = Arrays.stream(numbers)
                                .sum()/numbers
                                .length;
        double average2 = Arrays.stream(numbers)
                                .average()
                                .orElse(Double.NaN);
        double min = Arrays.stream(numbers)
                .min()
                .getAsDouble();
        System.out.println(average1 - min);
    }

    public void outputAllDuplicatesWithOddIndex()
    {
        double[] numbers = fillArray();
        for (int i = 0; i < numbers.length +1 ; i++)
        {
            for (int j = i + 1 ; j < numbers.length ; j++)
            {
                if ((numbers[i] == numbers[j]) & j%2 == 0)
                {
                System.out.println("duplicate index is: " + j + " and duplicate number is: " + numbers[j]);
                }
            }
        }
    }

    public void replaceAllOddElementsWIthZero()
    {
        double[] numbers = fillArray();
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] % 2 == 0)
            {
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}