package InterviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {

		String str = "abbaaca";
		char y[] = str.toCharArray();
		int size = y.length;

		Map<Character, Integer> map = new LinkedHashMap<>();

		int i = 0;
		
		while (i != size) {
		if (map.containsKey(y[i]) == false) {
				map.put(y[i], 1);
			} else {
				int oldval = map.get(y[i]);
				int newval = oldval + 1;
				map.put(y[i], newval);
			}
			++i;
		}
		Set<Map.Entry<Character, Integer>> lhmap = map.entrySet();
		String result = "";
		for (Map.Entry<Character, Integer> data : lhmap) {
			result = result + data.getKey();
		}
		System.out.println(result);
	}
}
