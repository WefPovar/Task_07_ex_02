package com.company;

public class Main {

    public static void main(String[] args) {
        FindElement solution = new FindElement();

        int[] array = ArrayUtils.readIntArrayFromConsole();

        int positionOfSmallestElementInArray = solution.findThePositionOfTheLastSmallestElementOfTheArray(array);

        printPositionOfSmallestElementInArray(positionOfSmallestElementInArray);
    }

    private static void printPositionOfSmallestElementInArray(int positionOfSmallestElement) {
        System.out.println("Position of the last minimal element in the array: " + positionOfSmallestElement);
    }
}

