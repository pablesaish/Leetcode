class Solution {
    public int[] arrayRankTransform(int[] nums) {
        int n = nums.length;
        int[] sortedArr = Arrays.copyOf(nums, n);
        Arrays.sort(sortedArr);

        // rank[i] = rank of sortedArr[i]
        int[] rank = new int[n];
        if (n > 0) rank[0] = 1;
        for (int i = 1; i < n; i++) {
            rank[i] = rank[i - 1] + (sortedArr[i] != sortedArr[i - 1] ? 1 : 0);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int idx = Arrays.binarySearch(sortedArr, nums[i]);
            result[i] = rank[idx];
        }
        return result;
    }
}