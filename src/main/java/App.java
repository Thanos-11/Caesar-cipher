import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean control = true;
        while (control) {
            System.out.println("Enter en to encrypt a word, de to decrypt and exit to close ");
            try {
                String userInput = input.nextLine();
                if (userInput.equals("en")) {
                    Scanner encrypt = new Scanner(System.in);
                    System.out.println("Enter String to be encrypted: ");
                    String encryptText = encrypt.nextLine();
                    System.out.println("Enter encryption  key between 1-25");
                    Scanner key = new Scanner(System.in);
                    int keyValue = Integer.parseInt(key.next());
                    if (keyValue < 1 || keyValue> 25){
                        System.out.println("Sorry you have entered an incorrect key, you will have to restart the app");
                        System.exit(0);
                    }
                    Encrypting encrypting = new Encrypting(encryptText, keyValue);
                    System.out.println("---------------ENCRYPTED STRING------------------");
                    System.out.println(encrypting.encrypt());

                } else if (userInput.equals("de")) {
                    System.out.println("Enter String to be Decrypted: ");
                    Scanner decrypt = new Scanner(System.in);
                    String decryptValue = decrypt.nextLine();
                    System.out.println("Enter decryption key between 1 - 25");
                    Scanner decryptKey = new Scanner(System.in);
                    int key = Integer.parseInt(decryptKey.next());
                    Decrypting decrypting = new Decrypting(decryptValue,key);
                    System.out.println("--------------DECRYPTED STRING-----------------");
                    System.out.println(decrypting.decrypt());
                } else if (userInput.equals("exit")) {
                    System.out.println("Thank you welcome again");
                    control = false;
                }
                else {
                    System.out.println("Sorry try again!");
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Something went wrong");
            }
        }
    }
}
