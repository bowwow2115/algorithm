package algo;

import java.util.HashMap;
import java.util.Map;

public class HashRaceCompletion {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		int val = 0;

		Map<String, Integer> hm = new HashMap<>();

		for (String part : participant) {
			if (hm.get(part) == null)
				hm.put(part, 1);
			else {
				val = hm.get(part) + 1;
				hm.put(part, val);
			}
			System.out.println("participant key= " + part);
			System.out.println("participant value= " + hm.get(part));
		}

		for (String comp : completion) {
			val = hm.get(comp) - 1;
			hm.put(comp, val);
			System.out.println("completion key= " + comp);
			System.out.println("completion value= " + hm.get(comp));
		}

		for (String key : hm.keySet()) {
			if (hm.get(key) == 1)
				answer = key;
			System.out.println("final key= " + key);
			System.out.println("final value= " + hm.get(key));
		}
		return answer;
	}
}
