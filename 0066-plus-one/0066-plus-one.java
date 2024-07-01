class Solution {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        
        boolean needExtraDigit = true;
        for (int digit : digits) {
            if (digit != 9) {
                needExtraDigit = false;
                break;
            }
        }
        
        
        int[] out = new int[needExtraDigit ? l + 1 : l];
        
        
        int carry = 1; // Start with carry 1 since we're adding 1
        for (int i = l - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            out[i] = sum % 10;
            carry = sum / 10;
        }
        
        
        if (carry > 0) {
            out[0] = carry;
        }
        
        return out;
    }
}