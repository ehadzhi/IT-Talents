package task2;

public class UpperLetter {

	private char value;

	public UpperLetter(char value) throws UpperLetterException {
		if (isLetter(value)) {
			this.value = Character.toUpperCase(value);
		} else {
			throw new UpperLetterException("value = " + value + " is not a letter");
		}
	}

	public static boolean isLetter(char toCheck) {
		return ((toCheck >= 'a' && toCheck <= 'z') || (toCheck >= 'A' && toCheck <= 'Z'));
	}

	public char getValue() {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof UpperLetter) {
			UpperLetter toComp = (UpperLetter) obj;
			return this.getValue() == toComp.getValue();
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return (int)(this.getValue() - 'A');
	}

	@Override
	public String toString() {
		return  "" + value;
	}

}
