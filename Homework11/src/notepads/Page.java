package notepads;

public class Page {
	private String header;
	private String text;

	public Page(String header, String text) {
		if (header != null && text != null) {
			this.header = header;
			this.text = text;
		}
	}

	public boolean addText(String toAdd) {
		if (toAdd != null && !toAdd.equals("")) {
			text = text.concat(" " + toAdd);
			return true;
		}
		return false;
	}

	public void deleteText() {
		text = "";
	}

	public boolean replaceText(String toReplace) {
		if (toReplace != null && !toReplace.equals("")) {
			text = toReplace;
			return true;
		}
		return false;
	}

	public String getPage() {
		return (header + "\n" + text);
	}

	public boolean isEmpty() {
		return text.equals("");
	}

	@Override
	public String toString() {
		return getPage();
	}

	public boolean searchWord(String word) {
		String toSearch = (" " + word + " ");
		return text.indexOf(toSearch) >= 0;
	}

	public boolean containsDigits() {
		for (int index = 0; index < text.length(); index++) {
			if (text.charAt(index) >= '0' && text.charAt(index) <= '9') {
				return true;
			}
		}
		return false;
	}
}
