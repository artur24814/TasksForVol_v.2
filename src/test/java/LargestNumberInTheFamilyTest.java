import org.junit.jupiter.api.Test;
import task4.LargestNumberInTheFamily;
import task4.NotInZeroToTensOfThousandsRangeException;

import static org.junit.jupiter.api.Assertions.*;

public class LargestNumberInTheFamilyTest {

    @Test
    void testValidInputRange() {
        LargestNumberInTheFamily largestNumberInTheFamily = new LargestNumberInTheFamily();
        assertDoesNotThrow(() -> largestNumberInTheFamily.getResult(0));
        assertDoesNotThrow(() -> largestNumberInTheFamily.getResult(10_000));
        assertDoesNotThrow(() -> largestNumberInTheFamily.getResult(5_000));
    }

    @Test
    void testInvalidInputRange() {
        LargestNumberInTheFamily largestNumberInTheFamily = new LargestNumberInTheFamily();
        NotInZeroToTensOfThousandsRangeException notInZeroToTensOfThousandsRangeException1 = assertThrows(
            NotInZeroToTensOfThousandsRangeException.class,
            () -> largestNumberInTheFamily.getResult(-1),
            "Expected exception for n=-1, but it didn't occur"
        );
        assertEquals(
            "valueToCheck must be between 0 and 10_000 (inclusive)",
            notInZeroToTensOfThousandsRangeException1.getMessage());

        NotInZeroToTensOfThousandsRangeException notInZeroToTensOfThousandsRangeException2 = assertThrows(
            NotInZeroToTensOfThousandsRangeException.class,
            () -> largestNumberInTheFamily.getResult(100_000),
            "Expected exception for n=100_000, but it didn't occur"
        );
        assertEquals(
            "valueToCheck must be between 0 and 10_000 (inclusive)",
            notInZeroToTensOfThousandsRangeException2.getMessage());
    }

    @Test
    void testIsReturningIntIsTheSameFamilyThenInput () throws NotInZeroToTensOfThousandsRangeException {
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

    @Test
    void testIsReturningValueIsCorrect () throws NotInZeroToTensOfThousandsRangeException {
        LargestNumberInTheFamily largestNumberInTheFamily = new LargestNumberInTheFamily();

        assertEquals(
            751,
            largestNumberInTheFamily.getResult(175),
            "Failed for number=175"
        );

        assertEquals(
            321,
            largestNumberInTheFamily.getResult(213),
            "Failed for number=321"
        );

        assertEquals(
            553,
            largestNumberInTheFamily.getResult(553),
            "Failed for number=553"
        );
    }
}
