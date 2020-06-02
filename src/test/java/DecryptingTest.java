import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptingTest {

    @Test
    public void getKey() {
            Decrypting test = new Decrypting(1, "Hi");
            int expectedInt = 1;
            assertEquals(expectedInt, Decrypting.getKey());
    }

    @Test
    public void getSentence_getCorrectSentence_String() {
        Decrypting test = new Decrypting(1, "Hello");
        String expectedOutput = "Hello";
        assertEquals(expectedOutput,Decrypting.getSentence());
    }

    @Test
    public void setSentence_getCorrectSentence_String() {
        Decrypting.setSentence("Hello");
        assertEquals("Hello", Decrypting.getSentence());
    }

    @Test
    public void test_decrypting_decryptString_string(){
        Decrypting decrypting = new Decrypting(23,"QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD");
        String expectedOuput = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        assertEquals(expectedOuput,decrypting.decrypt());
    }
}