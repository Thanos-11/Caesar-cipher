import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptingTest {

    @Test
    public void getSentence() {
    }

    @Test
    public void getKey() {
    }

    @Test
    public void setSentence() {
    }

    @Test
    public void setKey() {
        Encrypt encrypt = new Encrypt(1, "hey");
        assertEquals(1, encrypt.getKey());
    }

    @Test
    public void encrypt() {
    }
}