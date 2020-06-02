public class Decrypting {

    private String sentence;
    private int key;

    public Decrypting(String sentence, int key){
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

    public String decrypt() {
        StringBuilder decodedValue = new StringBuilder();
        for (int i = 0;i<this.sentence.length();i++){
            int character = this.sentence.charAt(i);
            if (Character.isUpperCase(character)){
                character -=this.key%26;
                if (character<'A')character += 26;
            }
            else if (Character.isLowerCase(character)){
                character -=this.key%26;
                if (character<'a')character += 26;
            }
            decodedValue.append((char)character);
        }
        return decodedValue.toString();
    }
}
