/*
 * @lc app=leetcode id=1748 lang=java
 *
 * [1748] Sum of Unique Elements
 */

// @lc code=start
class Solution {
    public int sumOfUnique(int[] nums) {

        int sum = 0;
        boolean isUnique = true;
        for (int i = 0; i < nums.length; i++) {
            isUnique = true;
            for (int y = 0; y < nums.length; y++) {
                if (i != y && nums[i] == nums[y]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique)
                sum += nums[i];
        }

        return sum;
    }
}
// @lc code=end
