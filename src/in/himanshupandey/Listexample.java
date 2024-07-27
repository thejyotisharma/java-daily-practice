package in.himanshupandey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Listexample {


    public ArrayList<String> toChangePassword(ArrayList<String> alist) {
        String currPassword = alist.get(0);
        alist.remove(currPassword);
        alist.add(alist.size(), currPassword);
        return alist;
    }

    public String favouriteAuthor(ArrayList<String> alist, int n) {
        String favouriteAuth = null;
        favouriteAuth = alist.get(alist.size() - n);

        return favouriteAuth;
    }

    public ArrayList<String> toUpperCase(ArrayList<String> alist) {
        ArrayList<String> alist1 = new ArrayList<>();
        System.out.println("\nOriginal strings:");
        for (String str : alist) {
            System.out.println(str);
            alist1.add(str.toUpperCase());
        }

        return alist1;
    }

    public HashMap<String, ArrayList<String>> lowerUpperCase(ArrayList<String> alist) {
        ArrayList<String> lowerCases = new ArrayList<>();
        ArrayList<String> upperCases = new ArrayList<>();
        for (String str : alist) {
            System.out.println(str);
            lowerCases.add(str.toLowerCase());
            upperCases.add(str.toUpperCase());

        }
        HashMap<String, ArrayList<String>> myMap = new HashMap<>();
        myMap.put("lower", lowerCases);
        myMap.put("upper", upperCases);

        return myMap;
    }

    public int distinctNumbers(ArrayList<Integer> alist) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : alist) {
            if (map.containsKey(i)) {
                int Value = map.get(i);
                map.put(i, Value + 1);

            } else {
                map.put(i, 1);
            }

        }
        return map.keySet().size();
    }

    public HashMap<String, ArrayList<String>> splitAccordingToCase(ArrayList<String> alist) {
        HashMap<String, ArrayList<String>> myMap = new HashMap<>();
        ArrayList<String> lowerCases = new ArrayList<>();
        ArrayList<String> upperCases = new ArrayList<>();
        for (String str : alist) {
            System.out.println(str);

            if (str.toUpperCase().equals(str)) {
                upperCases.add(str);
            } else {
                lowerCases.add(str);
            }
        }

        myMap.put("lower", lowerCases);
        myMap.put("upper", upperCases);

        return myMap;
    }

    public boolean areEqual(List<String> first, List<String> second) {
        return first.equals(second);
    }

    public ArrayList<String> combine(List<String> first, List<String> second) {
        ArrayList<String> nlist = new ArrayList<>();
        nlist.addAll(first);
        nlist.addAll(second);
        return nlist;
    }

    public List<String> getPortionOfList(List<String> combine, int start, int end) {
        return combine.subList(start, end+1);
    }

}






/*
 * This method should take a list of names and return a hashmap with two keys "lower" and "upper".
 * The value of the key "lower" should be a list of names in lower case and the value of the key "upper" should be a list of names in upper case.
 * Example:
 * * * *
 * Input: ["Amit", "Mohit", "Kunal", "Rahul"]
 * Output: {"lower": ["amit", "mohit", "kunal", "rahul"], "upper": ["AMIT", "MOHIT", "KUNAL", "RAHUL"]}
 * * *
 * * * */
//public HashMap<String, ArrayList<String>> splitAccordingToCase( ArrayList<String> names) {




