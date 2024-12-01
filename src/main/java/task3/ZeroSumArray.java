package task3;

import task3.RandomIntGenerator;
import task2.CalcSumArray;

public class ZeroSumArray {
    public int[] generate(int expectedArrLength) throws NotOneTo100RangeException {
        if (!isValidInputs(expectedArrLength)){
            throw new NotOneTo100RangeException("expectedArrLength must be between 1 and 100 (inclusive)");
        }
        return getZeroSumArray(expectedArrLength);
    }

    private boolean isValidInputs (int inputValue) {
        return inputValue >= 1 && inputValue <= 100;
    }

    private int[] getZeroSumArray(int expectedArrLength) {
        int [] zeroSumArray = new int[expectedArrLength];

        setRandomElementsWithoutLastIntoArray(zeroSumArray);
        setLatEqualizationNumber(zeroSumArray);

        return  zeroSumArray;
    }

    private void setRandomElementsWithoutLastIntoArray(int[] arrayToPopulate) {
        for (int i = 0; i < arrayToPopulate.length-1; i++){
            arrayToPopulate[i] = RandomIntGenerator.getNext(-10, 10);
        }
    }

    private void setLatEqualizationNumber(int[] arrayToPopulate){
        arrayToPopulate[arrayToPopulate.length-1] = getLastEqualizationNumber(arrayToPopulate);
    }

    private int getLastEqualizationNumber(int [] arrayWithoutLastElement){
        int sumOfArrayElementsWithoutLastElement = CalcSumArray.getSum(arrayWithoutLastElement);
        return -sumOfArrayElementsWithoutLastElement;
    }
}
