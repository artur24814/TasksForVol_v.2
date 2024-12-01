import org.junit.jupiter.api.Test;
import task1.StringOfLength;

import static org.junit.jupiter.api.Assertions.*;

public class StringOfLengthTest {
    @Test
    void testGetLengthCheckTheOnlyLengthOfTheReturnedValue (){
        assertEquals(5,
            StringOfLength.getLength(5).length(),
            "Failed for n=5"
        );
        assertEquals(6,
            StringOfLength.getLength(6).length(),
            "Failed for n=6"
        );
        assertEquals(28,
            StringOfLength.getLength(28).length(),
            "Failed for n=28"
        );
    }
}
