class Solution {
    public boolean isPalindrome(String s) {
        String t = s.toLowerCase();
        t = t.replaceAll(
          "[^a-zA-Z0-9]", "");
        int left = 0, right = t.length() - 1;
        while (left < right) {
            if (t.charAt(left) != t.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        
        return true;
        
    }
}