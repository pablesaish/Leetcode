class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums1.length; i++) {
            list.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++) {
            list.add(nums2[i]);
        }
        Integer[] combined = list.toArray(new Integer[0]);
        Arrays.sort(combined);
        int n = combined.length;
        if (n % 2 == 1) {
            return combined[n / 2];
        } else {
            return (combined[n / 2 - 1] + combined[n / 2]) / 2.0;
        }
    }
}