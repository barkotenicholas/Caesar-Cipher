import constants.Consts;

import java.util.Locale;

public class Encode {



    private final int shiftKey;
    private final String InputString;
    private String encodedText;


    public Encode(String InputString , int shiftKey) {
        this.shiftKey = shiftKey;
        this.InputString = InputString;

    }


    public String encode(){

        String message = InputString.toLowerCase(Locale.ROOT);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0;i < message.length();i++) {

            if (message.charAt(i) != ' '){
                int position = Consts.ALPHABET.indexOf(message.charAt(i));
                int val = (this.shiftKey+position)%26;
                char replace = Consts.ALPHABET.charAt(val);
                stringBuilder.append(replace);
            }else {
                stringBuilder.append(message.charAt(i));
            }

        }

        this.encodedText = stringBuilder.toString();

        return this.encodedText;
    }

    public int getShiftKey() {
        return shiftKey;
    }

    public String getInputString() {
        return InputString;
    }
    public String getEncodedText() {
        return this.encodedText;
    }

}
