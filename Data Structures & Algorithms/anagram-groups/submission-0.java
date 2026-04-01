class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       /* Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++){
            String s = strs[i];

            char[] arr = s.toCharArray();
            
            Arrays.sort(arr);
            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
        return new ArrayList<>(map.values());
        
    }
}
*/
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        
        return new ArrayList<>(map.values());
    }
}
