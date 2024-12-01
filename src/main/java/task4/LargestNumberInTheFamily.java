package task4;

import task4.NotInZeroToTensOfThousandsRangeException;

public class LargestNumberInTheFamily {
    public int getResult(int valueToCheck) throws NotInZeroToTensOfThousandsRangeException {
        if (!isValidInput(valueToCheck)){
            throw new NotInZeroToTensOfThousandsRangeException("valueToCheck must be between 0 and 10_000 (inclusive)");
        }
        return valueToCheck;
    }

    private boolean isValidInput (int inputValue) {
        return inputValue >= 0 && inputValue <= 10_000;
    }
}
