import org.junit.jupiter.api.Test;
import task2.CalcSumArray;
import task3.ZeroSumArray;
import task3.NotOneTo100RangeException;

import static org.junit.jupiter.api.Assertions.*;

public class ZeroSumArrayTest {

    @Test
    void testValidInputRange() {
        ZeroSumArray zeroSumArray = new ZeroSumArray();
        assertDoesNotThrow(() -> CalcSumArray.getSum(zeroSumArray.generate(1)));
        assertDoesNotThrow(() -> CalcSumArray.getSum(zeroSumArray.generate(100)));
        assertDoesNotThrow(() -> CalcSumArray.getSum(zeroSumArray.generate(50)));
    }

    @Test
    void testInvalidInputRange() {
        ZeroSumArray zeroSumArray = new ZeroSumArray();
        NotOneTo100RangeException notOneTo100Exception1 = assertThrows(
            NotOneTo100RangeException.class,
            () -> zeroSumArray.generate(0),
            "Expected exception for n=0, but it didn't occur"
        );
        assertEquals("expectedArrLength must be between 1 and 100 (inclusive)", notOneTo100Exception1.getMessage());

        NotOneTo100RangeException notOneTo100Exception2 = assertThrows(
            NotOneTo100RangeException.class,
            () -> zeroSumArray.generate(101),
            "Expected exception for n=101, but it didn't occur"
        );
        assertEquals("expectedArrLength must be between 1 and 100 (inclusive)", notOneTo100Exception2.getMessage());
    }

    @Test
    void testLengthOfReturningArray() throws Exception {
        ZeroSumArray zeroSumArray = new ZeroSumArray();
        assertEquals(
            6,
            zeroSumArray.generate(6).length,
            "Failed for expectedArrLength=6"
        );

        assertEquals(
            10,
            zeroSumArray.generate(10).length,
            "Failed for expectedArrLength=10"
        );

        assertEquals(
            100,
            zeroSumArray.generate(100).length,
            "Failed for expectedArrLength=100"
        );
    }

    @Test
    void testIfSumOfReturningArrayIsZero () throws NotOneTo100RangeException {
        ZeroSumArray zeroSumArray = new ZeroSumArray();
        assertEquals(
            0,
            CalcSumArray.getSum(zeroSumArray.generate(6)),
            "Failed for expectedArrLength=6"
        );

        assertEquals(
            0,
            CalcSumArray.getSum(zeroSumArray.generate(8)),
            "Failed for expectedArrLength=6"
        );

        assertEquals(
            0,
            CalcSumArray.getSum(zeroSumArray.generate(100)),
            "Failed for expectedArrLength=100"
        );
    }
}
