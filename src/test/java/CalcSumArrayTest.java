import org.junit.jupiter.api.Test;
import task2.CalcSumArray;

import static org.junit.jupiter.api.Assertions.*;

public class CalcSumArrayTest {
    @Test
    void testCalcSumArrayTestCheckTheCorrectReturnValue (){
        assertEquals(
            10,
            CalcSumArray.getSum(new int[] {0, 1, 2, 3, 4}),
            "Failed for {0, 1, 2, 3, 4}"
        );

        assertEquals(
            11,
            CalcSumArray.getSum(new int[] {1, 1, 2, 3, 4}),
            "Failed for {1, 1, 2, 3, 4}"
        );

        assertEquals(
            26,
            CalcSumArray.getSum(new int[] {4, 1, 10, 3, 8}),
            "Failed for {4, 1, 10, 3, 8}"
        );
    }
}
