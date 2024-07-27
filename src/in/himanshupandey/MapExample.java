package in.himanshupandey;

import java.util.HashMap;

public class MapExample {

    public boolean isValidAnagram(String s, String t) {
        HashMap<Character, Integer> myMap = new HashMap<>();
        for (Character i : s.toCharArray()) {
            if (myMap.containsKey(i)) {
                int Value = myMap.get(i);
                myMap.put(i, Value + 1);
            }
            myMap.put(i, 1);


        }
        for (Character c : t.toCharArray()) {
            if (myMap.containsKey(c)) {
                int Value = myMap.get(c);
                myMap.put(c, Value - 1);
            }
            myMap.put(c, 1);

        }
        return myMap.isEmpty();

    }

    public Integer wordCount(String[] arr, String ss) {
        HashMap<String, Integer> myMap = new HashMap<>();

        for (String i : arr) {
            if (myMap.containsKey(i)) {
                Integer Value = myMap.get(i);
                myMap.put(i, Value + 1);
            } else myMap.put(i, 1);
        }
        return myMap.getOrDefault(ss, 0);

    }

    public static Integer firstUniqueCharacter(String str) {
        HashMap<Character, Integer> myMap = new HashMap<>();
        for (Character c : str.toCharArray()) {
            if (myMap.containsKey(c)) {
                int Value = myMap.get(c);
                myMap.put(c, Value + 1);
            } else myMap.put(c, 1);

        }
        for (int i = 0; i <= str.length(); i++) {
            if (str.charAt(i) == 1) {
                return i;
            }
        }
        return -1;

    }

    public static int[] twoSums(int[] arr1, int target) {
        int[] arr = new int[2];
        for (int i = 0; i <= arr1.length - 1; i++) {
            for (int j = i+1; j <= arr1.length - 1; j++) {
                int sum1 = arr1[i] + arr1[j];
                if (sum1 != target) {
                    continue;
                }
                arr[0] = i;
                arr[1] = j;
            }
        }
        return arr;

    }



}



