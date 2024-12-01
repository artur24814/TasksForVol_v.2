import org.junit.jupiter.api.Test;
import task2.CalcSumArray;
import task3.ZeroSumArray;
import task3.NotOneTo100Exception;

import static org.junit.jupiter.api.Assertions.*;

public class ZeroSumArrayTest {

    @Test
    void testValidInputRange() {
        assertDoesNotThrow(() -> CalcSumArray.getSum(ZeroSumArray.generateArray(1)));
        assertDoesNotThrow(() -> CalcSumArray.getSum(ZeroSumArray.generateArray(100)));
        assertDoesNotThrow(() -> CalcSumArray.getSum(ZeroSumArray.generateArray(50)));
    }

    @Test
    void testInvalidInputRange() {
        NotOneTo100Exception notOneTo100Exception1 = assertThrows(
            NotOneTo100Exception.class,
            () -> ZeroSumArray.generateArray(0),
            "Expected exception for n=0, but it didn't occur"
        );
        assertEquals("expectedArrLength must be between 1 and 100 (inclusive)", notOneTo100Exception1.getMessage());

        NotOneTo100Exception notOneTo100Exception2 = assertThrows(
            NotOneTo100Exception.class,
            () -> ZeroSumArray.generateArray(101),
            "Expected exception for n=101, but it didn't occur"
        );
        assertEquals("expectedArrLength must be between 1 and 100 (inclusive)", notOneTo100Exception2.getMessage());
    }

    @Test
    void testIfSumOfReturningArrayIsZero () throws NotOneTo100Exception {
        assertEquals(
            0,
            CalcSumArray.getSum(ZeroSumArray.generateArray(6)),
            "Failed for expectedArrLength=6"
        );

        assertEquals(
            0,
            CalcSumArray.getSum(ZeroSumArray.generateArray(8)),
            "Failed for expectedArrLength=6"
        );

        assertEquals(
            0,
            CalcSumArray.getSum(ZeroSumArray.generateArray(100)),
            "Failed for expectedArrLength=100"
        );
    }
}
