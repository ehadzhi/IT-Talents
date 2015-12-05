
public class Task08 {

	public static void main(String[] args) {
		int[] array = { 1, 1, 1, 3, 23, 4, 1, 2, 4, 1, 2, 4, 4, 1, 4, 4,4,4 };
		int maxStartIndex = 0, maxLength = 0, currentStartIndex = 0, currentLength = 0;

		for (int index = 0; index < array.length - 1; index++) {
			if (array[index] == array[index + 1]) {
				currentLength = 0;
				currentStartIndex = index;
				for (int i = currentStartIndex; i < array.length; i++) {
					if (array[currentStartIndex] == array[i]) {
						currentLength++;
					} 
					else {
						break;
					}
				}
				if (currentLength > maxLength) {
					maxStartIndex = currentStartIndex;
					maxLength = currentLength;
				}
			}
		}

		for (int index = 0; index < maxLength; index++) {
			System.out.print(array[index + maxStartIndex] + " ");
		}

	}

}
