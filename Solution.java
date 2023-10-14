import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = new int[]{-3,3,4,90};
        int target = 0;

        System.out.println("Output: " + Arrays.toString(sol.twoSumV1(numbers, target)));
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
    public int[] twoSumV1(int[] numbers, int target){
        int left = 0, right = numbers.length - 1;
        while(numbers[left] + numbers[right] != target){
            int sum = numbers[left] + numbers[right];
            if(sum > target) right--;
            else left++;
        }
        return new int[]{left + 1, right + 1};
    }
}
