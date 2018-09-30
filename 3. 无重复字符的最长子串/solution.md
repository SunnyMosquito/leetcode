
```java
class Solution {
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
}
```

```python
class Solution:
    def lengthOfLongestSubstring(self, s):
        d = dict()
        result = 0
        i = 0
        for j in range(len(s)):
            if s[j] in d:
                i = max(d[s[j]] + 1, i)
            result = max(result, j + 1 - i)
            d[s[j]] = j
        return result
```