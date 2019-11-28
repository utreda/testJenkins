package com.adaming.testJenkins.UnitTestMaven;

public class NumberService {
    public NumberService() {
    }

    public int biggestNumber(int[] list) {
        int max = 0;

        for (int index = 0; index < list.length; ++index) {
            if (list[index] > max) {
                max = list[index];
            }
        }

        return max;
    }
}
