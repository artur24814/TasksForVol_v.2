package task4;

import task4.NotInZeroToTensOfThousandsRangeException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LargestNumberInTheFamily {
    public int getResult(int valueToCheck) throws NotInZeroToTensOfThousandsRangeException {
        if (!isValidInput(valueToCheck)){
            throw new NotInZeroToTensOfThousandsRangeException("valueToCheck must be between 0 and 10_000 (inclusive)");
        }

        List<Character> convertedList = convertIntIntoStringArray(valueToCheck);
        convertedList.sort(Collections.reverseOrder());

        String joinedString = joinCharList(convertedList);

        return Integer.parseInt(joinedString);
    }

    private boolean isValidInput (int inputValue) {
        return inputValue >= 0 && inputValue <= 10_000;
    }

    private List<Character> convertIntIntoStringArray(int number){
        List<Character> charList = new ArrayList<>();
        for (char c : Integer.toString(number).toCharArray()) {
            charList.add(c);
        }

        return charList;
    }

    private String joinCharList (List<Character> list) {
        return list.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
