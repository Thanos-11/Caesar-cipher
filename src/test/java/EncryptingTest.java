import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptingTest {

    @Test
    public void getKey_getCorrectKey_int() {
        EncryptingTest = new Encrypting()
        assertEquals(expectedInt, Encrypting.getKey());
    }
    }

    @Test
    public void getKey() {
        public void test_getKey_correctKey_Int(){
            Encrypting encrypting = new Encrypting("hi", 2);
            int expectedOutput = 2;
            assertEquals(expectedOutput,encrypting.getKey());
    }
    }

    @Test
    public void setSentence() {
        public void test_userEnterCorrectKey_int(){
            Encrypting encrypting = new Encrypting("HI", 2);
            assertTrue(Integer.class.isInstance(encrypting.getKey()));
    }
    }

    @Test
    public void setSentence_getCorrectSentence_String() {
        Encrypting.setSentence("Hello");
        assertEquals("Hello", Encrypting.getSentence());
    }

    @Test
    public void encrypt_encodeStringProvide_String(){
        Encrypting encrypting = new Encrypting(23, "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
        String expectedOutput = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        assertEquals(expectedOutput,encrypting.encrypt());
    }

}