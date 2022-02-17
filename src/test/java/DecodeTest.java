import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeTest {

    Decode decode;
    @BeforeEach
    public void setUp(){
        decode = new Decode("snhmtqfx",5);
    }

    @Test
    @DisplayName("Encoded class should instantiate correctly")
    public void newDecoded_instantiatesCorrectly(){
        assertNotNull(decode);
    }

    @Test
    @DisplayName("Decode class should get shiftKey")
    public void newEncoded_getShiftKey_5(){
        assertEquals(5,decode.getShiftKey());
    }


    @Test
    @DisplayName("Decoded class should get Cypher String")
    public void newDecoded_getCypherString_Cypher(){
        assertEquals("snhmtqfx",decode.getCypherString());
    }

    @Test
    @DisplayName("Decoded class should Decipher Input String")
    public void newDecoded_shiftInputString_Cypher(){

        assertEquals("nicholas",decode.decode());

    }

}