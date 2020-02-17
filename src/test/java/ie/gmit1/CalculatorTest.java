package ie.gmit1;

import ie.gmit.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    Calculator myCounter;

    @BeforeEach
    void init(){
        myCounter = new Calculator();
    }

    @Test
    void testaddNum(){
        myCounter = new Calculator();
        assertEquals(10,2,myCounter.Addsum(5,5));
    }

}
