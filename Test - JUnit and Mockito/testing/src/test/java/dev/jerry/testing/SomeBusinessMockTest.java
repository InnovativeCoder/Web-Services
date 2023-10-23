package dev.jerry.testing;

import dev.jerry.testing.Business.SomeBusinessImpl;
import dev.jerry.testing.data.SomeDataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {
    class SomeDataServiceStub implements SomeDataService{
        @Override
        public int[] retrieveAllData(){
            return new int[]{1,2,3};
        }
    }

    SomeBusinessImpl business = new SomeBusinessImpl();
    SomeDataService dataServiceMock = mock(SomeDataService.class);

    @BeforeEach
    public void before(){
        business.setSomeDataService(dataServiceMock);
    }
    @Test
    public void calculateSumUsingDataService_basic(){

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,2,3});

        assertEquals(6, business.calculateSumUsingDataService());
    }
}
