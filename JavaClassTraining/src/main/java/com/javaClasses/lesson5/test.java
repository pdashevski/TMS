package com.javaClasses.lesson5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
    public static void main(String[] args) {
        System.out.println(myMethod(15));
        System.out.println(myMethod(-1));
    }

    public static String myMethod(int number) {
        if(number % 3 == 0) {
            return "T";
        } else if(number % 5 == 0) {
            return "M";
        } else if (number % 3 == 0 && number % 5 == 0) {
            return "TMS";
        } else return "error";
    }

    @Test
    public void tst() {
        String result = myMethod(3);
        Assert.assertEquals(result, "T");
    }

    @Test
    public void tst1() {
        String result = myMethod(0);
        Assert.assertEquals(result, "error");
    }


    @Test
    public void tst2() {
        String result = myMethod((int)' ');
        Assert.assertEquals(result, "error");
    }

    @Test
    public void tst3() {
        String result = myMethod(6);
        Assert.assertEquals(result, "error");
    }
}
