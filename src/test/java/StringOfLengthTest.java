import org.junit.jupiter.api.Test;
import task1.StringOfLength;

import static org.junit.jupiter.api.Assertions.*;

public class StringOfLengthTest {
    @Test
    void testGetLengthCheckTheOnlyLengthOfTheReturnedValue (){
        assertEquals(
            5,
            StringOfLength.getLength(5).length(),
            "Failed for n=5"
        );
        assertEquals(
            6,
            StringOfLength.getLength(6).length(),
            "Failed for n=6"
        );
        assertEquals(
            28,
            StringOfLength.getLength(28).length(),
            "Failed for n=28"
        );
    }

    @Test
    void testGetLengthCheckTheCorrectReturnValue (){
        assertEquals(
            "+-+-+",
            StringOfLength.getLength(5),
            "Failed for n=5"
        );
        assertEquals(
            "+-+-+-",
            StringOfLength.getLength(6),
            "Failed for n=6"
        );
        assertEquals(
            "+-+-+-+-+-+-+-+-+-+-+-+-+-+-",
            StringOfLength.getLength(28),
            "Failed for n=28"
        );
    }

    @Test
    void testPerformance() {
        int n = 100_000;
        long startTime = System.nanoTime();
        StringOfLength.getLength(n);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;
        System.out.println("Execution time for n=1,000: " + duration + " nanoseconds");
    }
}
