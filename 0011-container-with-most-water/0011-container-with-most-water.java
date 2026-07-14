class Solution {
    public int maxArea(int[] height) {
        // int n = height.length;
        // int maxArea = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         int width = j - i;
        //         int h = Math.min(height[i], height[j]);
        //         int area = width * h;
        //         maxArea = Math.max(maxArea, area);
        //     }
        // }
        // return maxArea;

        int left = 0; int right = height.length-1;
        int maxArea = 0;
        while(left <= right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, width*h);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}