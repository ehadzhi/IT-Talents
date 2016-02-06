package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

	public static void main(String[] args) throws Exception {

		Map<UpperLetter, MyInteger> frequencyTable = new HashMap<UpperLetter, MyInteger>();
		String testString = "Obicham shopskata salata, rakiq ledena da piq.";
		char currentChar;
		UpperLetter currentKey;
		for (int index = 0; index < testString.length(); index++) {
			currentChar = testString.charAt(index);
			if (UpperLetter.isLetter(currentChar)) {
				currentKey = new UpperLetter(testString.charAt(index));
				if (!frequencyTable.containsKey(currentKey)) {
					frequencyTable.put(currentKey, new MyInteger(1));
				} else {
					(frequencyTable.get(currentKey)).increment();
				}
			}
		}

		List<UpperLetter> keyList = new ArrayList<UpperLetter>(frequencyTable.keySet());

		Collections.sort(keyList,
				(one, two) -> frequencyTable.get(two).getValue() - frequencyTable.get(one).getValue());

		keyList.forEach(key -> {
			int freq = frequencyTable.get(key).getValue();
			System.out.format("%s: %3d ", key ,freq );
			for (int i = 0; i < freq; i++) {
				System.out.print("#");
			}
			System.out.println();
		});

	}

}
