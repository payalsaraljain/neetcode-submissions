class Solution {

    List<Integer> string_length = new ArrayList<>();

    public String encode(List<String> strs) {
        String result = "";
        for(int i = 0; i < strs.size(); i++) {
            result += strs.get(i);
            string_length.add(strs.get(i).length());
        }
        return result;
    }

    public List<String> decode(String str) {
       List<String> result = new ArrayList<>();
       int i = 0;
       int j = 0;
       
       while(j < string_length.size()){
        result.add(str.substring(i, i + string_length.get(j)));
        i = i + string_length.get(j);
        j++;
       }
       return result;
    }
}
