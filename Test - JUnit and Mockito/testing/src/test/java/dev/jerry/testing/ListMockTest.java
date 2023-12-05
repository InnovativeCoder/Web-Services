package dev.jerry.testing;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class ListMockTest {

    List mock = mock(List.class);

    @Test
    public void size_basic(){
        when(mock.size()).thenReturn(5);
        assertEquals(5, mock.size());
    }

    @Test
    public void returnDifferentValues(){
        when(mock.size()).thenReturn(5).thenReturn(10);
        assertEquals(5, mock.size());
        assertEquals(10, mock.size());
    }

    @Test
    public void returnWithParameters(){
        when(mock.get(0)).thenReturn("Jerry");
        assertEquals("Jerry", mock.get(0));
        assertEquals(null, mock.get(1));
    }

    @Test
    public void returnWithGenericParameters(){
        when(mock.get(anyInt())).thenReturn("Jerry");
        assertEquals("Jerry", mock.get(0));
        assertEquals("Jerry", mock.get(1));
    }

    // Verfications
    @Test
    public void verificationBasics(){
        //SUT
        String value1 = (String) mock.get(0);
        String value2 = (String) mock.get(1);

        //Verify
        verify(mock).get(0);
//        verify(mock).get(anyInt());
        verify(mock, times(2)).get(anyInt());
        verify(mock, atLeast(1)).get(anyInt());
        verify(mock, atLeastOnce()).get(anyInt());
        verify(mock, atMost(2)).get(anyInt());
        verify(mock, never()).get(2);
    }

    // Arguement capture
    @Test
    public void arguementCapturing(){
        //SUT
        mock.add("someString");

        //Verification
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mock).add(captor.capture());

        assertEquals("someString", captor.getValue());
    }
}
