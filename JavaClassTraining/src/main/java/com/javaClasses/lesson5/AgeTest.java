package com.javaClasses.lesson5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeTest {
    public static void main(String[] args) {

    }

    public boolean ageTest(int age) {
        if(age >= 0 || age <= 120) {
            return true;
        } else return false;
    }

    @Test
    public void tst1() {
        boolean result = ageTest(119);
        Assert.assertEquals(result, true);
    }

    @Test
    public void tst2() {
        boolean result = ageTest(120);
        Assert.assertEquals(result, true);
    }

    @Test
    public void tst3() {
        boolean result = ageTest(121);
        Assert.assertEquals(result, false);
    }

    @Test
    public void tst4() {
        boolean result = ageTest(-1);
        Assert.assertEquals(result, false);
    }

    @Test
    public void tst5() {
        boolean result = ageTest(0);
        Assert.assertEquals(result, true);
    }

    @Test
    public void tst6() {
        boolean result = ageTest(1);
        Assert.assertEquals(result, true);
    }
}
