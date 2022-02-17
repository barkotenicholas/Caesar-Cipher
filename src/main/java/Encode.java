import constants.Consts;

import java.util.Locale;

public class Encode {



    private int shiftKey;
    private String InputString;
    private String encodedText;

    public Encode(String InputString ,int shiftKey) {
        this.shiftKey = shiftKey;
        this.InputString = InputString;
        this.encodedText = "";
    }


    public String encode(){

        String message = InputString.toLowerCase(Locale.ROOT);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0;i < message.length();i++) {
            int position = Consts.ALPHABET.indexOf(message.charAt(i));
            int val = (this.shiftKey+position)%26;
            char replace = Consts.ALPHABET.charAt(val);
            stringBuilder.append(replace);

        }

        encodedText= stringBuilder.toString();

        return encodedText;
    }

    public int getShiftKey() {
        return shiftKey;
    }

    public String getInputString() {
        return InputString;
    }
}
