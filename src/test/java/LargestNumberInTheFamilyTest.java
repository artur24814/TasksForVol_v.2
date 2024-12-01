import org.junit.jupiter.api.Test;
import task4.LargestNumberInTheFamily;

import static org.junit.jupiter.api.Assertions.*;

public class LargestNumberInTheFamilyTest {

    @Test
    void testIsReturningIntIsTheSameFamilyThenInput (){
        LargestNumberInTheFamily largestNumberInTheFamily = new LargestNumberInTheFamily();

        int input1 = 234;
        int result1 = largestNumberInTheFamily.getResult(input1);

        assertEquals(
            Integer.toString(input1).toCharArray().length,
            Integer.toString(result1).toCharArray().length,
            "Failed for number=" + input1
        );

        int input2 = 254;
        int result2 = largestNumberInTheFamily.getResult(input2);

        assertEquals(
            Integer.toString(input2).toCharArray().length,
            Integer.toString(result2).toCharArray().length,
            "Failed for number=" + input2
        );

        int input3 = 4567;
        int result3 = largestNumberInTheFamily.getResult(input3);

        assertEquals(
            Integer.toString(input3).toCharArray().length,
            Integer.toString(result3).toCharArray().length,
            "Failed for number=" + input2
        );
    }
}
