import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {

    @Test
    public void getKey() {
        Encrypt encrypt = new Encrypt(1, "Testfortherun");
        assertEquals(1, encrypt.getKey());
    }

    @Test
    public void getSentence() {
        Encoding encrypt = new Encrypt(1, "test123");
        assertEquals("hey", encrypt.getSentence());
    }
}