import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        var result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            var x = nums[i];
            if (i > 0 && x == nums[i - 1]) continue;
            var firstPointer = i + 1;
            var secondPointer = nums.length - 1;
            while (firstPointer < secondPointer) {
                var y = nums[firstPointer];
                var z = nums[secondPointer];
                var sum = x + y + z;
                if (sum > 0) {
                    secondPointer--;
                } else if (sum < 0) {
                    firstPointer++;
                } else {
                    result.add(List.of(x, y, z));
                    firstPointer++;
                    while (nums[firstPointer - 1] == nums[firstPointer] && firstPointer < secondPointer) {
                        firstPointer++;
                    }
                    secondPointer--;
                    while (nums[secondPointer + 1] == nums[secondPointer] && secondPointer > firstPointer) {
                        secondPointer--;
                    }
                }
            }
        }
        return result;
    }
}