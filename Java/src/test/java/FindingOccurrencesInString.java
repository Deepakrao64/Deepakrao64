import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class FindingOccurrencesInString {

    @Test
    public void mostFrequentCharacterInString() {
        String str1 = "Successes";
        int[] ctr = new int[256];
        int i;
        for (i = 0; i < str1.length(); i++)
            System.out.println((ctr[str1.charAt(i)])++);
    }

    @Test
    public void findingOccurrenceOfWords() {
        String s = "Automation Testing Manual Testing Functional Testing Manual Execution";
        String[] s2 = s.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String word : s2) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else map.put(word, 1);
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    @Test
    public void countNoOfOccurrenceOfWord(){
        String s = "Automation Testing Manual Testing Functional Testing Manual Execution";
        String[] strArr = s.split(" ");
        int count = 0;
        for (String word : strArr) {
            if (word.equals("Testing")) count++;
        }
        System.out.println("No of time Testing word present is :: "+count);
    }
}
