class Solution {
    public int minimumSwaps(int[] nums) {
    int n = nums.length;
    int zeros = 0;
    for (int x=0; x<n; x++) {
        if (nums[x] == 0) zeros++;
    }
    
    if (zeros == 0 || zeros == n) return 0;
    
    // The last `zeros` positions are where all zeros should end up.
    // Count how many non-zero elements are currently sitting there —
    // each one must be swapped out with a misplaced zero from the front.
    int misplacedNonZeros = 0;
    for (int i = n - zeros; i < n; i++) {
        if (nums[i] != 0) {
            misplacedNonZeros++;
        }
    }
    
    return misplacedNonZeros;
}
}