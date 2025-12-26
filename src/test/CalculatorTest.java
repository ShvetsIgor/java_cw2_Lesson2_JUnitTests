package test;

import demo.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @AfterEach
    @Disabled
    void tearDown() {
    }

    @Test
    void sumPositiveCase() {

        assertEquals(110, Calculator.sum(100, 10));
        assertEquals(-110, Calculator.sum(-100, -10));
        assertEquals(0, Calculator.sum(0,0));
    }

    @Test
    void sumNegativeCase() {

        assertNotEquals(100, Calculator.sum(100, 10));
        assertNotEquals(-90, Calculator.sum(-100, -10));
        assertNotEquals(10, Calculator.sum(0,0));
    }

    @Test
    void subPositiveCase() {

        assertEquals(90, Calculator.sub(100, 10));
        assertEquals(-50, Calculator.sub(50, 100));
        assertEquals(-90, Calculator.sub(-100, -10));
        assertEquals(0, Calculator.sub(0,0));
    }

    @Test
    void subNegativeCase() {

        assertNotEquals(110, Calculator.sub(100, 10));
        assertNotEquals(50, Calculator.sub(50, 100));
        assertNotEquals(-110, Calculator.sub(-100, -10));
        assertNotEquals(10, Calculator.sub(0,0));
    }

    @Test
    void mulPositiveCase() {

        assertEquals(1000, Calculator.mul(10, 100));
        assertEquals(-100, Calculator.mul(-10, 10));
        assertEquals(100, Calculator.mul(-10, -10));
        assertEquals(0, Calculator.mul(0,0));
        assertEquals(0, Calculator.mul(10, 0));
    }

    @Test
    void mulNegativeCase() {

        assertNotEquals(100, Calculator.mul(10, 100));
        assertNotEquals(-1000, Calculator.mul(-10, 10));
        assertNotEquals(-100, Calculator.mul(-10, -10));
        assertNotEquals(1, Calculator.mul(0,0));
    }

    @Test
    void divPositiveCase() {

        assertEquals(10, Calculator.div(100, 10));
        assertEquals(2.5, Calculator.div(10, 4)); //not passed, fixed - to double
        assertEquals(-20, Calculator.div(-100, 5));
        assertEquals(-1, Calculator.div(0,0)); //not passed, fixed with if
        assertEquals(0, Calculator.div(0, 10));
    }

    @Test
    void divNegativeCase() {

        assertNotEquals(50, Calculator.div(100, 10));
        assertNotEquals(2.55, Calculator.div(10, 4)); //not passed, fixed - to double
        assertNotEquals(20, Calculator.div(-100, 5));
        assertNotEquals(1, Calculator.div(0,0)); //not passed, fixed with if
        assertNotEquals(-1, Calculator.div(0, 10));
    }
}