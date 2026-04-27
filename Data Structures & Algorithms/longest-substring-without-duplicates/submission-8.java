class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> luna = new HashSet<>();
        int l = 0, res = 0;
        for(int i = 0; i < s.length(); i++){
            while(luna.contains(s.charAt(i))){
                luna.remove(s.charAt(l));
                l++;
            }
            luna.add(s.charAt(i));
            res = Math.max(res, i - l + 1);
        }
        return res;
    }
}
