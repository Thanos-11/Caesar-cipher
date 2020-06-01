public class Decrypt {
    private static  int key;
    private static String sentence;

    public Decrypt (int key, String sentence){
        Decode.key = key;
        Decode.sentence = sentence;
    }
    public static int getKey(){
        return key;
    }

    public static String getSentence(){
        return sentence;
    }
}
