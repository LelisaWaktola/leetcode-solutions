package medium.hashmap;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars); // sort letters
            String key = new String(chars);

            // If key not present, create a new list
            map.computeIfAbsent(key, k -> new ArrayList<>());

            // Add original string to its group
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    // Main method to test
    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();
        String[] input = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = solution.groupAnagrams(input);
        System.out.println(result);
    }
}

