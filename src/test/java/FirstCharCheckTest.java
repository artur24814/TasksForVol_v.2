import org.junit.jupiter.api.Test;
import task5.FirstCharCheck;

import static org.junit.jupiter.api.Assertions.*;

public class FirstCharCheckTest {
    @Test
    void testShouldReturnIsUpper (){
        assertEquals(
            FirstCharCheck.IS_UPPER,
            FirstCharCheck.repFirstChar("Upper Text ....")
        );
    }

    @Test
    void testShouldReturnIsLower (){
        assertEquals(
            FirstCharCheck.IS_LOWER,
            FirstCharCheck.repFirstChar("lower Text ....")
        );
    }

    @Test
    void testShouldReturnIsDigit (){
        assertEquals(
            FirstCharCheck.IS_DIGIT,
            FirstCharCheck.repFirstChar("123 digit Text ....")
        );
    }

    @Test
    void testShouldReturnIsOther (){
        assertEquals(
            FirstCharCheck.IS_OTHER,
            FirstCharCheck.repFirstChar("@ other Text ....")
        );
    }
}
