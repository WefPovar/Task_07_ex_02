package com.company;

import org.junit.Assert;
import org.junit.Test;

public class testsOfFindElement {
    FindElement solution = new FindElement();

    @Test
    public void firstTestOfSolution() {
        int[] testingArray = {5, 5, 5, 2, 2, 3, 5, 6};
        int expectedResult = 5;
        int factualResult = solution.findThePositionOfTheLastSmallestElementOfTheArray(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void secondTestOfSolution() {
        int[] testingArray = {2, 2, 1, 3, 2, 8, 9};
        int expectedResult = 3;
        int factualResult = solution.findThePositionOfTheLastSmallestElementOfTheArray(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void thirdTestOfSolution() {
        int[] testingArray = {3, 2, 1, 1, 2, 2, 2};
        int expectedResult = 4;
        int factualResult = solution.findThePositionOfTheLastSmallestElementOfTheArray(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void fourthTestOfSolution() {
        int[] testingArray = {7, 8, 9, 9, 1, 2, 2, 2, 2};
        int expectedResult = 5;
        int factualResult = solution.findThePositionOfTheLastSmallestElementOfTheArray(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void fifthTestOfSolution() {
        int[] testingArray = {1, 2, 3, 4, 5, 5};
        int expectedResult = 1;
        int factualResult = solution.findThePositionOfTheLastSmallestElementOfTheArray(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void sixthTestOfSolution() {
        int[] testingArray = {5, 4, 3, 3, 2, 2, 1, 1, 1};
        int expectedResult = 9;
        int factualResult = solution.findThePositionOfTheLastSmallestElementOfTheArray(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void seventhTestOfSolution() {
        int[] testingArray = {2, 2, 2, 2, 1, 1, 4, 3};
        int expectedResult = 6;
        int factualResult = solution.findThePositionOfTheLastSmallestElementOfTheArray(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void eighthTestOfSolution() {
        int[] testingArray = {9, 5, 3, 3, 3, 2, 2};
        int expectedResult = 7;
        int factualResult = solution.findThePositionOfTheLastSmallestElementOfTheArray(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void ninthTestOfSolution() {
        int[] testingArray = {2, 3, 6, 7, 7, 7, 9, 9, 9, 9};
        int expectedResult = 1;
        int factualResult = solution.findThePositionOfTheLastSmallestElementOfTheArray(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void tenthTestOfSolution() {
        int[] testingArray = {1, 9, 2, 3, 4, 4, 5, 5, 5, 5, 5};
        int expectedResult = 1;
        int factualResult = solution.findThePositionOfTheLastSmallestElementOfTheArray(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }
}
