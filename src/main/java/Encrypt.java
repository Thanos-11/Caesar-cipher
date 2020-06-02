public class Encrypt {
    private String sentence;
    private int key;

    public Encrypt(String sentence, int key) {
        this.sentence = sentence;
        this.key = key;

    }

    public String getSentence() {
        return sentence;
    }

    public int getKey() {
        return key;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String encrypt() {
        StringBuilder encryptValue = new StringBuilder();
        for (int i = 0; i<this.sentence.length();i++){
            int character = (int)this.sentence.charAt(i);
            if (Character.isUpperCase(character)) {
                character = character + (this.key % 26);
                if (character > 'Z') character = character - 26;
            }
            else if (Character.isLowerCase(character)) {
                character = character + (this.key % 26);
                if (character > 'z') character = character - 26;
            }
            encryptValue.append((char) character);

        }
        return encryptValue.toString();
    }
}


