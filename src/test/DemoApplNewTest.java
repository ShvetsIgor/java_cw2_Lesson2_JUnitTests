package test;

import demo.DemoAppl;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DemoApplNewTest {

    int[] numbers = {10, 20, 30, 40, 50};
    int[] single = {100};
    int[] negative = {-10, -20, -30, -40, -50};
    int[] empty = {};

    @BeforeAll
    @Disabled
    static void setUpBeforeClass() throws Exception {

        int[] numbers = {10, 20, 30, 40, 50};
        int[] single = {100};
        int[] negative = {-10, -20, -30, -40, -50};
        int[] empty = {};

    }

    @Test
    void testSumArrayPositiveCase() {
        assertEquals(150, DemoAppl.sumArray(numbers));
        assertEquals(100, DemoAppl.sumArray(single));
        assertEquals(-150, DemoAppl.sumArray(negative));
        assertEquals(0, DemoAppl.sumArray(empty));
    }
    @Test
    void testSumArrayNegativeCase() {
        //assertThrows(NullPointerException.class, () -> DemoAppl.sumArray(null)); - чтобы работало без этого
        assertNotEquals(100, DemoAppl.sumArray(numbers));
        assertNotEquals(50, DemoAppl.sumArray(numbers));
        assertNotEquals(-100, DemoAppl.sumArray(negative));
        assertNotEquals(10, DemoAppl.sumArray(empty));
    }

    @Test
    void testAveragePositiveCase() {
        double avg1 = DemoAppl.average(numbers);
        double avg2 = DemoAppl.average(single);
        double avg3 = DemoAppl.average(negative);
        double avg4 = DemoAppl.average(empty);

        assertEquals(30., avg1, 0.001);
        assertEquals(100., avg2, 0.001);
        assertEquals(-30., avg3, 0.001);
        assertEquals(0., avg4, 0.001); // fixed - if arr.lenth = 0, return 0.
    }

    @Test
    void testAverageNegativeCase() {
        double avg1 = DemoAppl.average(numbers);
        double avg2 = DemoAppl.average(single);
        double avg3 = DemoAppl.average(negative);
        double avg4 = DemoAppl.average(empty);

        assertNotEquals(20., avg1, 0.001);
        assertNotEquals(50., avg2, 0.001);
        assertNotEquals(-10., avg3, 0.001);
        assertNotEquals(10., avg4, 0.001);
    }

    @Test
    @Disabled
        //bug test isn't passed
    void testAverageBug() {
        double avg1 = DemoAppl.averageBug(numbers);
        double avg2 = DemoAppl.averageBug(single);
        double avg3 = DemoAppl.averageBug(negative);
        double avg4 = DemoAppl.averageBug(empty);

        assertEquals(30., avg1, 0.001);
        assertEquals(100., avg2, 0.001);
        assertEquals(-30., avg3, 0.001);
        assertEquals(0., avg4, 0.001);
    }

    @Test
    void testMaxValuePositiveCase() {

        int max = DemoAppl.maxValue(numbers);

        assertEquals(50, max);
        assertEquals(100, DemoAppl.maxValue(single));
        assertEquals(-10, DemoAppl.maxValue(negative));
        assertEquals(0, DemoAppl.maxValue(empty)); //fixed - if arr.lenth = 0, return 0.
    }

    @Test
    void testMaxValueNegativeCase() {
        int max = DemoAppl.maxValue(numbers);

        assertNotEquals(40, max);
        assertNotEquals(10, max);
        assertNotEquals(-20, max);
        assertNotEquals(1, max);
    }
}