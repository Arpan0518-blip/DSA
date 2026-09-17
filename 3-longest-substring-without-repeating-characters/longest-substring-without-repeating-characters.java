class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int left = 0, right = 0;
        int ans = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            ans = Math.max(ans, right-left +1);
            right++;
        }
        return ans;
    }
}