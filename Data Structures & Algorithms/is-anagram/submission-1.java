class Solution {
    public boolean isAnagram(String s, String t) {
           int[] freq_cal = new int[26];
        if (s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i++) {
            freq_cal[s.charAt(i) - 'a']++;
            freq_cal[t.charAt(i) - 'a']--;
        }
        for(int i =0; i < freq_cal.length; i++) {
            if (freq_cal[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
