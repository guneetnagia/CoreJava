
import java.io.*;
import java.util.*;

class Result {

    public static int makeAnagram(String a, String b) {
        if(a.length()==0){
            return b.length();
        }
        if(b.length() == 0){
            return a.length();
        }
        int counter = 0;
        Map<Character, Integer> map = new HashMap<>();
        char[] aArray = a.toCharArray();
        for (char c : aArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        char[] bArray = b.toCharArray();
        List<Character> bRemaining = new ArrayList<>();
        for (char c : bArray) {
            if (map.containsKey(c) && map.get(c) != 0) {
                map.put(c, map.get(c)-1);
            }
            else {
                bRemaining.add(c);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            counter = counter + entry.getValue();
        }
        counter = counter+bRemaining.size();
        return counter;
    }

}

public class MakingAnagram {
    public static void main(String[] args) throws IOException {
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        int res = Result.makeAnagram(a, b);
        System.out.println(res);
    }
}
