import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncodeTest {
    
    Encode encode;
    
    @BeforeEach
    public void setUp(){
        encode = new Encode();
    }

    @Test
    @DisplayName("Encoded class should instantiate correctly")
    void newEncoded_instantiatesCorrectly() {
        assertNotNull(encode);
    }
}