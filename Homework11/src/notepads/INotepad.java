package notepads;

public interface INotepad {
	boolean addText(String toAdd, int pageNum);

	boolean replaceText(String toReplace, int pageNum);
	
	boolean deleteText(int pageNum);
	
	void seeAllPages();
	
	int searchWord(String word);
	
	void printAllPagesWithDigits();
}
