package BreakLeetcode;
import java.util.*;
public class LetterCombination {

        static Map<Integer, List<String>> map = new HashMap<>();

        static {
            map.put(2, List.of("a","b","c"));
            map.put(3, List.of("d","e","f"));
            map.put(4, List.of("g","h","i"));
            map.put(5, List.of("j","k","l"));
            map.put(6, List.of("m","n","o"));
            map.put(7, List.of("p","q","r","s"));
            map.put(8, List.of("t","u","v"));
            map.put(9, List.of("w","x","y","z"));
        }
        public static List<String> letterCombinations(String digits) {
            if(digits == null || digits.length() == 0)
                return Collections.emptyList();
            List<String> result = new ArrayList<>();
            findCombinations(0, new StringBuilder(), digits.toCharArray(), result);
            return result;
        }

    static void  findCombinations(int idx, StringBuilder letters, char[] chars, List<String> result) {
            if(idx == chars.length) {
                result.add(letters.toString());
                return;
            }
            for(String c : map.get(chars[idx]-'0')) {
                letters.append(c);
                findCombinations(idx+1, letters, chars, result);
                letters.deleteCharAt(letters.length()-1);
            }
        }

    public static void main(String[] args) {
        String s="23";
        List<String>res=letterCombinations(s);
        System.out.println(res);

    }
    }

