import constants.Consts;

import java.util.Locale;

public class Decode {

    private int shiftkey;
    private String cypherString;
    String cypher;
    public Decode(String cypherString,int shiftKey) {
        this.shiftkey = shiftKey;
        this.cypherString = cypherString;
        cypher = "";
    }

    public String decode(){
        StringBuilder stringBuilder = new StringBuilder();
        cypherString = cypherString.toLowerCase(Locale.ROOT);

        for (int i = 0; i< cypherString.length();i++){

            int position = Consts.ALPHABET.indexOf(cypherString.charAt(i));
            int val =(position - shiftkey) %26;

            if (val < 0)
                val = Consts.ALPHABET.length() + val;

            char replace = Consts.ALPHABET.charAt(val);
            stringBuilder.append(replace);
        }
        cypher = stringBuilder.toString();

        return cypher;

    }

    public int getShiftKey() {
        return shiftkey;
    }


    public String getCypherString() {
        return cypherString;
    }
}
