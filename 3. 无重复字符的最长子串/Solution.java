import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            ans = Math.max(ans, j + 1 - i);
            map.put(s.charAt(j), j);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "abcccbc";
        int result = solution.lengthOfLongestSubstring(str);
        System.out.println(result);
    }
}
