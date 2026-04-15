class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> luna = new HashMap<>();
        for(String a : strs){
            char[] arr = a.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            luna.putIfAbsent(sorted, new ArrayList<>());
            luna.get(sorted).add(a);
        }
        return new ArrayList<>(luna.values());
    }
}
