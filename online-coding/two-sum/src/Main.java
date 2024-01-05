import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            var num = nums[i];
            var x = target - num;
            if (map.containsKey(x)) {
                return new int[] { map.get(x), i };
            } else {
                map.put(num, i);
            }
        }
        throw new IllegalStateException();
    }
}