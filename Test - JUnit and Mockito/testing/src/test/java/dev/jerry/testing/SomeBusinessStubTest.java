package dev.jerry.testing;

import dev.jerry.testing.Business.SomeBusinessImpl;
import dev.jerry.testing.data.SomeDataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessStubTest {
    class SomeDataServiceStub implements SomeDataService{
        @Override
        public int[] retrieveAllData(){
            return new int[]{1,2,3};
        }
    }

    @Test
    public void calculateSumUsingDataService_basic(){
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStub());
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 6;
        assertEquals(expectedResult,actualResult);
    }
}
