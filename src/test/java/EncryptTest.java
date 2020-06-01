import org.junit.Test;

import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class EncryptTest {

    @Test
    public void getKey() {
        Encrypt encrypt = new Encrypt(1, "hey");
        assertEquals(1, encrypt.getKey());
    }

    @Test
    public void getSentence() {
        Encrypt encrypt = new Encrypt(1, "hey");
        assertEquals("hey", encrypt.getSentence());
    }
}