package dev.jerry.testing;

import dev.jerry.testing.Business.SomeBusinessImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessTest {

    @Test
    public void calculateSum_basic(){
        SomeBusinessImpl business = new SomeBusinessImpl();
        int actualResult = business.calculateSum(new int[]{1,2,3});
        int expectedResult = 6;
        assertEquals(expectedResult,actualResult);
    }
}
