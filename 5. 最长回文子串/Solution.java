public class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = "";
        String str = "";
        for (int i = 0; i < n; i++) {
            for (int j = 1 + i; j < 1 + n; j++) {
                str = s.substring(i, j);
                System.out.println(str + " " + i + " " + j);
                if (isPalindrome(str) && ans.length() < str.length()) {
                    ans = str;
                }
            }
        }
        return ans;
    }

    public boolean isPalindrome(String s) {
        int n = s.length() / 2;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "abb";
        String result = solution.longestPalindrome(str);
        // boolean result = solution.isPalindrome(str);
        System.out.println(result);
    }
}
