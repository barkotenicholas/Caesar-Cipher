import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncodeTest {
    
    Encode encode;
    
    @BeforeEach
    public void setUp(){
        encode = new Encode("nicholas",5);
    }

    @Test
    @DisplayName("Encoded class should instantiate correctly")
    public void newEncoded_instantiatesCorrectly() {
        assertNotNull(encode);
    }

    @Test
    @DisplayName("Encoded class should get shiftKey")
    public void newEncoded_getShiftKey_5(){
        assertEquals(5,encode.getShiftKey());
    }

    @Test
    @DisplayName("Encoded class should get Input String")
    public void newEncoded_getInputString_Name(){
        assertEquals("nicholas",encode.getInputString());
    }

    @Test
    @DisplayName("Encoded class should shift Input String")
    public void newEncoded_shiftInputString_Cypher(){

        assertEquals("snhmtqfx",encode.encode());

    }

}