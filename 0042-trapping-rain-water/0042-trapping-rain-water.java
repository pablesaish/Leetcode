class Solution {
    public int trap(int[] height) {
        int length = height.length;
        int leftMax[] = new int[length];
        leftMax[0] = height[0];
        for(int i=1; i<length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int rightMax[] = new int[length];
        rightMax[length-1] = height[length-1];
        for(int i=length-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        int waterLevel[] = new int[length];
        for(int i=0; i<length; i++){
            waterLevel[i] = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel[i] - height[i];
        }
        return trappedWater;
    }
}