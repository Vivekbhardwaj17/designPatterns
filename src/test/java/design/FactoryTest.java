package design;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FactoryTest {

    @Test
    public void testPrintMessage() {
        String message = "New Word";
        assertEquals(message,"New Word");
    }
}
