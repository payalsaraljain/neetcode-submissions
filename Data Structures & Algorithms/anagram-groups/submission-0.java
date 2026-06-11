class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> anagrams = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String sorted = new String(temp);
            anagrams.computeIfAbsent(sorted, k -> new ArrayList<>()).add(strs[i]);
        }
        for(Map.Entry<String, List<String>> anagram : anagrams.entrySet()) {
            result.add(anagram.getValue());
        }
        return result;
    }
}
