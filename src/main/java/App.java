import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Text you want to be Encrypted :");
        String inputString = scanner.nextLine();
        System.out.println("Enter the Shift Key : (1-25)");
        int shiftkey = scanner.nextInt();

        if (shiftkey >= 1 && shiftkey <= 25) {

            Encode encode;
            Decode decode;
            encode = new Encode(inputString, shiftkey);
            System.out.println("Input Message :" + inputString);
            System.out.println("Encrypted Message is \n" + encode.encode());

            decode = new Decode(encode.getEncodedText(), shiftkey);
            System.out.println("Decrypted Message is \n" + decode.decode());
        }else {
            System.out.println("Please input a shift key between 1 and 25");
        }


    }

}
