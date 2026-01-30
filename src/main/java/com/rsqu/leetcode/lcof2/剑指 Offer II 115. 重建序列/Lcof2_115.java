// Uncomment when needed:
// import com.rsqu.leetcode.util.ListNode;
// import com.rsqu.leetcode.util.TreeNode;

public class Lcof2_115 {
    // Problem statement: README.md in this folder.

    public int solution(int[] nums) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_115 solution = new Lcof2_115();

        // Example 1:
        // Input: nums = [1,2,3], sequences = [[1,2],[1,3]]
        // Output: false
        // 解释：有两种可能的超序列：[1,2,3]和[1,3,2]。
        // 序列 [1,2] 是[1,2,3]和[1,3,2]的子序列。
        // 序列 [1,3] 是[1,2,3]和[1,3,2]的子序列。
        // 因为 nums 不是唯一最短的超序列，所以返回false。
        // Example 2:
        // Input: nums = [1,2,3], sequences = [[1,2]]
        // Output: false
        // 解释：最短可能的超序列为 [1,2]。
        // 序列 [1,2] 是它的子序列：[1,2]。
        // 因为 nums 不是最短的超序列，所以返回false。

        // TODO: replace with the correct input/output types.
        // int[] input = {1, 2, 3};
        // System.out.println(solution.solution(input));
    }
}
