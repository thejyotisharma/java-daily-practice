package in.himanshupandey;

import java.util.HashMap;

public class MiscExamples {
    public void checkIsogram(String s) {
        HashMap<Character, Integer> mymap = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (mymap.containsKey(c)) {
                System.out.println("Given string is not an Isogram");
                return;
            } else {
                mymap.put(c, 1);
            }
        }
        System.out.println("Given string is an Isogram");
    }

    public void repeatedCharacter(String s) {
        HashMap<Character, Integer> mymap = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (mymap.containsKey(c)) {
                int value = mymap.get(c);
                mymap.put(c, value + 1);
            } else {
                mymap.put(c, 1);
            }
        }
        System.out.println(mymap);
    }

    public int allDigitsSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;

    }

    public void capitaliseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String arr1 : arr) {
            sb.append(Character.toUpperCase(arr1.charAt(0)));
            sb.append(arr1.substring(1));
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
//    or another approach
    //StringBuilder sb = new StringBuilder();
//        boolean isNextCharacterUpper = false;
//        for(int i=0; i <s.length();i++){
//            if (isNextCharacterUpper == true){
//                String upperCase = ""+s.charAt(i);
//                sb.append(upperCase.toUpperCase());
//            }else {
//                sb.append(s.charAt(i));
//            }
//
//            if (s.charAt(i) == ' '){
//                isNextCharacterUpper = true;
//            }else{
//                isNextCharacterUpper = false;
//            }
//        }
//        System.out.println(sb.toString());
//    }

    public Boolean toCheckPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                System.out.println("False");
                return false;
            }
        }
        System.out.println("True");
        return true;
    }

    public boolean primeNumber(int n) {
        int num;
        if(n<=1){
            return false;
        }
        for(int i=2; i< n;i++){
            num = n%i;
            if(num==0){
                return false;
            }
        }
        return true;

    }
}