class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;   // no carry needed, done
            }
            digits[i] = 0;       // it was 9, becomes 0, carry continues
        }

        // if we get here, every digit was 9 (e.g. 999 -> 1000)
        int[] result = new int[n + 1];
        result[0] = 1;
        // rest of result[] is already 0 by default
        return result;
    }
}