package algo;

import java.util.HashMap;

public class HashPhoneBook {
	public Boolean phoneBook(String[] phoneList) {
		Boolean answer = false;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String item : phoneList) {
			if (hm.put(item.substring(0, 2), 0) != null) {
				System.out.println("null: " + item);
			} else {
				hm.put(item.substring(0, 2), 0);
				System.out.println(item);
			}
		}
		for (String item : hm.keySet()) {
			System.out.println("hashmap: "+item);
		}
		return answer;
	}

}
