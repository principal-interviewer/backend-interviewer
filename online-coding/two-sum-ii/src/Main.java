import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        var firstPointer = 0;
        var secondPointer = numbers.length - 1;
        while (true) {
            var sum = numbers[firstPointer] + numbers[secondPointer];
            if (sum == target) return new int[] { firstPointer + 1, secondPointer + 1 };
            if (sum > target) {
                secondPointer--;
            } else {
                firstPointer++;
            }
        }
    }
}