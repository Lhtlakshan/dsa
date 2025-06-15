package unittesting;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNormalTest {
    @Test
    void productTest(){
        int actual = new TestNormal().product(2,4);
        assertEquals(8,actual,()->"Wrong");
    }
}
