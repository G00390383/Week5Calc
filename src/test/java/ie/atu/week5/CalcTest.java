package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc myCalc;

    @BeforeEach
    void setUp() {
        myCalc = new Calc();
    }

    @Test
    void testAdd(){
        assertEquals(4, myCalc.add(2, 2));
    }
    @Test
    void testSubtract() {
        assertEquals(2, myCalc.subtract(4, 2));
    }
    @Test
    void testMultiply(){
        assertEquals(6, myCalc.multiply(3, 2));
    }
    @Test
    void testDivide(){
        assertEquals(3, myCalc.divide(6, 2));
    }
    @AfterEach
    void tearDown() {
    }
}