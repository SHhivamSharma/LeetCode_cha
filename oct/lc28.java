///49. Group Anagrams


class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        if (s.length == 1) {
            List<String> list = new ArrayList<>(1);
            list.add(s[0]);
            List<List<String>> res = new ArrayList<>(1);
            res.add(list);
            return res;
        }
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String word : s) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if (map.containsKey(key)) {
                map.get(key).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}