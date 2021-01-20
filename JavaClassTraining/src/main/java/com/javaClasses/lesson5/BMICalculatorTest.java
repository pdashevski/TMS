package com.javaClasses.lesson5;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class BMICalculatorTest {
    @Test
    public void normalCategoryTest() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("wg")).sendKeys("85");
        $(By.name("ht")).sendKeys("185");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Normal");
        Selenide.closeWebDriver();
    }

    @Test
    public void overWeightCategoryTest() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("wg")).sendKeys("99");
        $(By.name("ht")).sendKeys("182");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Overweight");
        Selenide.closeWebDriver();
    }

    @Test
    public void lessThen10WeightTest() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("wg")).sendKeys("9");
        $(By.name("ht")).sendKeys("182");
        $(By.name("cc")).click();
        String alertText = Selenide.switchTo().alert().getText();
        Assert.assertEquals(alertText, "Weight should be greater than 10kgs");
        Selenide.closeWebDriver();
    }

    @Test
    public void weight10Test() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("wg")).sendKeys("10");
        $(By.name("ht")).sendKeys("182");
        $(By.name("cc")).click();
        String alertText = Selenide.switchTo().alert().getText();
        Assert.assertEquals(alertText, "Weight should be greater than 10kgs");
        Selenide.closeWebDriver();
    }

    @Test
    public void weight11Test() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("wg")).sendKeys("11");
        $(By.name("ht")).sendKeys("182");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Starvation");
        Selenide.closeWebDriver();
    }

    @Test
    public void heightIs33Test() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("wg")).sendKeys("50");
        $(By.name("ht")).sendKeys("33");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Obese");
        Selenide.closeWebDriver();
    }

    @Test
    public void heightLessThan33Test() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("wg")).sendKeys("50");
        $(By.name("ht")).sendKeys("32");
        $(By.name("cc")).click();
        String alertText = Selenide.switchTo().alert().getText();
        Assert.assertEquals(alertText, "Height should be taller than 33cms");
        Selenide.closeWebDriver();
    }
}
