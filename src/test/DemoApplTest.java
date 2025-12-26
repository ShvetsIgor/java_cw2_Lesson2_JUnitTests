package test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DemoApplTest {

    @BeforeAll
    //происходит каждый раз перед началом всех тестов

    static void setBefore() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    //перед каждый тестом

    public void setUp() {
        System.out.println("@BeforeEach");
    }

    @AfterEach
    //после каждого теста, например очищать что-то после каждого теста
    public void tearDown() {
        System.out.println("@AfterEach");
    }

    @AfterAll
    static void testAfterAll() {
        System.out.println("@AfterAll");
    }

    @Test
    public void testEquals() {

        //	сравнение - первое число - ожидаемый результат, второе число проверяемое
        assertEquals(4, 2+2);
        assertNotEquals(4, 2+3);
        System.out.println("equals int");
    }

    @Test
    @Disabled //отключаем тест
    public void testEqualsDouble() {

        //double не сравниваем напрямую, передаем сравниваемые и погрешность, с которой сравниваем
        double x = 2.51;
        double y = 2.5;

        assertEquals(x, y, 0.01);
        assertNotEquals(x, y, 0.001);
        System.out.println("double");
    }

    @Test
    public void testBoolean() {

        assertTrue(2+2==4);
        assertFalse(2+2!=4);
        System.out.println("boolean");
    }

    @Test
    public void testNull() {
        assertNull(null);
        assertNotNull("hello");
        System.out.println("null");
    }

    @Test
    public void testSame() {

        //сравнивание объектов - ссылки
        String str = new String("hello"); //одна ссылка
        String str1 = new String("hello"); //другая ссылка
        String str3 = str1; //стр3 - так же ссылка, что и у стр1

        //без создания нового объекта, джава ищет недавно созданный такой же объект и ссылается на него автоматически
        String str4 = "hello";
        String str5 = "hello";

        assertSame(str1, str3);
        assertNotSame(str, str1);
        assertSame(str4, str5);
        System.out.println("string");
    }

    @Test
    public void testArray() {
        int[]arr1 = {1, 2, 3, 4, 5};
        int[]arr2 = {1, 2, 3, 4, 5};
        //сначала сравниваем длину массивов
        assertEquals(arr2.length, arr1.length);

        //последовательно сравниваем по индексам через фор
        //можно использовать, если надо сравнить только часть массива, а не весь
        for (int i = 0; i < arr2.length; i++) {
            assertEquals(arr2[i], arr1[i]);
        }
        System.out.println("arrays");
    }

    @Test
    public void testArray_() {
        int[]arr1 = {1, 2, 3, 4, 5};
        int[]arr2 = {1, 2, 3, 4, 5};
        //сначала сравниваем длину массивов
        assertEquals(arr2.length, arr1.length);
        //тот же смысл, но уже встроенный под капот
        assertArrayEquals(arr2, arr1);
        System.out.println("arrays1");
    }

    @Test
    public void testVoid() {
        System.out.println("Void method");
    }

}