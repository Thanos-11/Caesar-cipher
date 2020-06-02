import org.junit.Test;

import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class EncryptTest {

    @Test
    public void test_getString_returnStringEntered_String(){
        Encode encode = new Encode("hi", 2);
        String expectedOutput = "hi";
        assertEquals(expectedOutput, encode.getSentence());
    }

    @Test
    public void test_getKey_correctKey_Int(){
        Encode encode = new Encode("hi", 2);
        int expectedOutput = 2;
        assertEquals(expectedOutput,encode.getKey());
    }
}