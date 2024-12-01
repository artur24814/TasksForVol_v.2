import org.junit.jupiter.api.Test;
import task2.CalcSumArray;
import task3.ZeroSumArray;

import static org.junit.jupiter.api.Assertions.*;

public class ZeroSumArrayTest {

    @Test
    void testIfSumOfReturningArrayIsZero () {
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
