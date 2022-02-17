import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeTest {

    Decode decode;
    @BeforeEach
    public void setUp(){
        decode = new Decode();
    }

    @Test
    @DisplayName("Encoded class should instantiate correctly")
    public void newDecoded_instantiatesCorrectly(){
        assertNotNull(decode);
    }

}