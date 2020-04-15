package com.epam.cdp.java_testng.anastasiia_udovychenko.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import static java.lang.StrictMath.abs;
import static jdk.nashorn.internal.objects.NativeString.indexOf;

public class TwentyRandomsAlgorithm {

    public void swapElements()
    {
        double[] numbers = new double[20];
        for(int i=0; i<numbers.length; i++)
        {
            Random random = new Random();
            numbers[i] = random.nextInt(20) - 10;
        }
        System.out.println(Arrays.toString(numbers));
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
}