public class Encrypt {
    private int key;
    private String sentence;
    public Encrypt(int key, String sentence){
        this.key = key;
        this.sentence= sentence;
}
    public int getKey() {
        return key;
    }

    public String getSentence() {
        return sentence;
    }
}
