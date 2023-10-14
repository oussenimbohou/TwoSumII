import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = new int[]{-1,0};
        int target = -1;

        System.out.println("Output: " + Arrays.toString(sol.twoSum(numbers, target)));
    }

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> lookupTable = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int extra = target - numbers[i];
            if(lookupTable.containsKey(extra) && lookupTable.get(extra) != i){
                return new int[]{lookupTable.get(extra) + 1, i + 1};
            }
            lookupTable.put(numbers[i], i);
        }
        return null;
    }
}
