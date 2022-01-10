package com.company;

public class FindElement {

    public int findThePositionOfTheLastSmallestElementOfTheArray(int[] array) {
        int minElement = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
                minIndex = i;
                System.out.println("---" + minElement);
            }
            if (minElement == array[i]) {
                minElement = array[i];
                minIndex = i + 1;
            }
        }
        System.out.println("--" + minElement);
        System.out.println("-" + minIndex);
        return minIndex;
    }
}
