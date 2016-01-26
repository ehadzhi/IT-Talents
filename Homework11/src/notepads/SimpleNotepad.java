package notepads;

public class SimpleNotepad implements INotepad {

	private Page[] pages;
	protected int numPages;
	protected final String name;

	public SimpleNotepad(int numPages, String name) {
		if (numPages > 0 && name != null && !name.equals("")) {
			this.numPages = numPages;
			this.name = name;
			this.pages = new Page[numPages];

			for (int index = 0; index < numPages; index++) {
				pages[index] = new Page("Page " + (index + 1), "");
			}
		} else {
			this.name = "Unnamed";
		}
	}

	@Override
	public boolean addText(String toAdd, int pageNum) {
		return textEdit(toAdd, pageNum, 2);
	}

	@Override
	public boolean replaceText(String toReplace, int pageNum) {
		return textEdit(toReplace, pageNum, 1);
	}

	@Override
	public boolean deleteText(int pageNum) {
		return textEdit("", pageNum, 3);
	}

	@Override
	public void seeAllPages() {
		for (int index = 0; index < pages.length; index++) {

			if (!pages[index].isEmpty()) {
				System.out.println(pages[index] + "\n");
			}
		}
	}

	protected boolean textEdit(String toEdit, int pageNum, int operation) {
		if (toEdit != null && !toEdit.equals("") && pageNum > 0 && pageNum <= numPages) {
			pageNum--;
			switch (operation) {
			case 1:
				pages[pageNum].replaceText(toEdit);
				break;
			case 2:
				pages[pageNum].addText(toEdit);
				break;
			default:
				pages[pageNum].deleteText();
				break;
			}
			return true;
		}
		return false;
	}

	@Override
	public int searchWord(String word) {
		for (int index = 0; index < pages.length; index++) {

			if (pages[index].searchWord(word)) {
				return index;
			}
		}
		return -1;
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int index = 0; index < pages.length; index++) {

			if (pages[index].containsDigits()) {
				System.out.println( pages[index]);
			}
		}
	}
}
