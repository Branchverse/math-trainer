package org.trainer;

import org.junit.Assert;
import org.junit.Test;
import org.trainer.model.*;

public class ArithmeticTest {

    private final String BEGINNER = "beginner";
    private final String MEDIUM = "medium";
    private final String HARD = "hard";

    @Test
    public void test_checkInputPattern_positive() {
        Assert.assertTrue(Helper.checkInputPattern("1234567890"));
    }

    @Test
    public void test_checkInputPattern_negative() {
        Assert.assertFalse(Helper.checkInputPattern(""));
        Assert.assertFalse(Helper.checkInputPattern("abc"));
        Assert.assertFalse(Helper.checkInputPattern("ABC"));
        Assert.assertFalse(Helper.checkInputPattern("öäü"));
        Assert.assertFalse(Helper.checkInputPattern("ÖÄÜ"));
        Assert.assertFalse(Helper.checkInputPattern("+#-/,.²³$%&/()=?`´<>"));
        Assert.assertFalse(Helper.checkInputPattern("a123"));
        Assert.assertFalse(Helper.checkInputPattern("ä123"));
        Assert.assertFalse(Helper.checkInputPattern("a 123"));
        Assert.assertFalse(Helper.checkInputPattern("ä 123"));
        Assert.assertFalse(Helper.checkInputPattern("123 a"));
        Assert.assertFalse(Helper.checkInputPattern("123_a"));
        Assert.assertFalse(Helper.checkInputPattern("123 ä"));
        Assert.assertFalse(Helper.checkInputPattern("123_ä"));
        Assert.assertFalse(Helper.checkInputPattern("123_4"));
        Assert.assertFalse(Helper.checkInputPattern("123 4"));
        Assert.assertFalse(Helper.checkInputPattern("123h4"));
    }

    /* -- Addition -- */
    @Test
    public void test_addition_beginner() {
        Arithmetic add = new Addition(BEGINNER);
        int result = add.getSolution();
        Assert.assertTrue(result >= 2 && result <= 100);
    }

    @Test
    public void test_addition_medium() {
        Arithmetic add = new Addition(MEDIUM);
        int result = add.getSolution();
        Assert.assertTrue(result >= 200 && result <= 1000);
    }

    @Test
    public void test_addition_hard() {
        Arithmetic add = new Addition(HARD);
        int result = add.getSolution();
        Assert.assertTrue(result >= 2000 && result <= 10000);
    }

    /* -- Subtraction -- */
    @Test
    public void test_subtraction_beginner() {
        Arithmetic add = new Subtraction(BEGINNER);
        int result = add.getSolution();
        Assert.assertTrue(result >= -19 && result <= 19);
    }

    @Test
    public void test_subtraction_medium() {
        Arithmetic add = new Subtraction(MEDIUM);
        int result = add.getSolution();
        Assert.assertTrue(result >= -80 && result <= 80);
    }

    @Test
    public void test_subtraction_hard() {
        Arithmetic add = new Subtraction(HARD);
        int result = add.getSolution();
        Assert.assertTrue(result >= -900 && result <= 900);
    }

    /* -- Multiplication -- */
    @Test
    public void test_multiplication_beginner() {
        Arithmetic multi = new Multiplication(BEGINNER);
        int result = multi.getSolution();
        Assert.assertTrue(result >= 2 && result <= 81);
    }

    @Test
    public void test_multiplication_medium() {
        Arithmetic multi = new Multiplication(MEDIUM);
        int result = multi.getSolution();
        Assert.assertTrue(result >= 36 && result <= 144);
    }

    @Test
    public void test_multiplication_hard() {
        Arithmetic multi = new Multiplication(HARD);
        int result = multi.getSolution();
        Assert.assertTrue(result >= 100 && result <= 225);
    }

    /* -- Division -- */
    @Test
    public void test_division_beginner() {
        Arithmetic divi = new Division(BEGINNER);
        int result = divi.getSolution();
        Assert.assertTrue(result >= 1 && result <= 10);
    }

    @Test
    public void test_division_medium() {
        Arithmetic divi = new Division(MEDIUM);
        int result = divi.getSolution();
        Assert.assertTrue(result >= 6 && result <= 12);
    }

    @Test
    public void test_division_hard() {
        Arithmetic divi = new Division(HARD);
        int result = divi.getSolution();
        Assert.assertTrue(result >= 10 && result <= 15);
    }

    /* -- Exponent -- */
    @Test
    public void test_exponent_beginner() {
        Arithmetic expo = new Exponent(BEGINNER);
        int result = expo.getSolution();
        Assert.assertTrue(result >= 1 && result <= 100);
    }

    @Test
    public void test_exponent_medium() {
        Arithmetic expo = new Exponent(MEDIUM);
        int result = expo.getSolution();
        Assert.assertTrue(result >= 25 && result <= 400);
    }

    @Test
    public void test_exponent_hard() {
        Arithmetic expo = new Exponent(HARD);
        int result = expo.getSolution();
        Assert.assertTrue(result >= 1 && result <= 1000);
    }

    /* -- Root -- */
    @Test
    public void test_root_beginner() {
        Arithmetic root = new Root(BEGINNER);
        int result = root.getSolution();
        Assert.assertTrue(result >= 1 && result <= 8);
    }

    @Test
    public void test_root_medium() {
        Arithmetic root = new Root(MEDIUM);
        int result = root.getSolution();
        Assert.assertTrue(result >= 8 && result <= 20);
    }

    @Test
    public void test_root_hard() {
        Arithmetic root = new Root(HARD);
        int result = root.getSolution();
        Assert.assertTrue(result >= 3 && result <= 15);
    }

    /* -- OrderOfOperation -- */
    @Test
    public void test_orderOfOperation_beginner() {
        Arithmetic order = new OrderOfOperation(BEGINNER);
        int result = order.getSolution();
        Assert.assertTrue(result >= 2 && result <= 110);
    }

    @Test
    public void test_orderOfOperation_medium() {
        Arithmetic order = new OrderOfOperation(MEDIUM);
        int result = order.getSolution();
        Assert.assertTrue(result >= 132 && result <= 240);
    }

    @Test
    public void test_orderOfOperation_hard() {
        Arithmetic order = new OrderOfOperation(HARD);
        int result = order.getSolution();
        Assert.assertTrue(result >= 272 && result <= 420);
    }
}