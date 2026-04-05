class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> luna = new HashMap<>();
        for(String a : strs){
            char[] arr = a.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            luna.putIfAbsent(s, new ArrayList<>());
            luna.get(s).add(a);
        }
        return new ArrayList<>(luna.values());
    }
}
