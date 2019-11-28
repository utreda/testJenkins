package com.adaming.testJenkins;

import com.adaming.testJenkins.UnitTestMaven.NumberService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestNumber {
    public TestNumber() {
    }

    @Test
    public void testBiggestNumber() {
        int[] list = new int[]{7, 8, 9};
        NumberService numberService = new NumberService();
        int biggest = numberService.biggestNumber(list);
        Assert.assertEquals(9L, (long) biggest);
        int[] list2 = new int[]{1, 2, 3};
        int biggest2 = numberService.biggestNumber(list2);
        Assert.assertEquals(3L, (long) biggest2);
    }
}
