package com.epam.cdp.java_testng.anastasiia_udovychenko.task1;

import java.util.Scanner;

public class Calculator {
    public void calc()
        {
            System.out.println("Please enter integer first number: ");
            String firstNumber = dialogMessageForNumber();
            System.out.println("Please enter integer second number: ");
            String secondNumber = dialogMessageForNumber();
            System.out.println("Please enter operation (+, -, * or /): ");
            String operation = dialogMessageForOperation();
            performCalculationAndReturnResult(firstNumber, secondNumber, operation);
        }

        public void performCalculationAndReturnResult(String firstNumber, String secondNumber, String operation)
        {
            double result;
            switch(operation)
            {
                case "+" :
                    result = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
                    System.out.println("The result is: " + result);
                    break;
                case "-" :
                    result = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);
                    System.out.println("The result is: " + result);
                    break;
                case "*" :
                    result = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);
                    System.out.println("The result is: " + result);
                    break;
                case "/" :
                    if (!secondNumber.equals("0"))
                    {
                        result = Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
                        //To ask: result = Integer.parseInteger(firstNumber) / Integer.parseInteger(secondNumber) return 0
                        System.out.println("The result is: " + result);
                        break;
                    }
                    else
                        System.out.println("Division by zero exception");
                        break;
                default :
                    System.out.println("Interesting, how could I get here");
                    break;
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

    public boolean isAllowedOperationCharacter(String str)
    {
        if (str == null) {
            return false;
        }
        if (str.trim().equals("+") || str.trim().equals("-") || str.trim().equals("*") || str.trim().equals("/"))
        {
            return true;
        }
        return false;
    }

    public String dialogMessageForNumber() {
        Scanner scanner = new Scanner(System.in);
        String returnNumber = scanner.nextLine();
        while (!isNumeric(returnNumber)) {
            System.out.println("Entered number " + returnNumber + " is not integer. Please enter integer number: ");
            returnNumber = scanner.nextLine();
        }
        return returnNumber;
    }

    public String dialogMessageForOperation() {
        Scanner scanner = new Scanner(System.in);
        String returnOperation = scanner.nextLine();
        while (!isAllowedOperationCharacter(returnOperation)) {
            System.out.println("Entered operation " +returnOperation+ " is not allowed. Please enter operation (+, -, * or /): ");
            returnOperation = scanner.nextLine();
        }
        return returnOperation;
    }
}
