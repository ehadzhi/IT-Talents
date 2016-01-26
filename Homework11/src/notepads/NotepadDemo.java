package notepads;

public class NotepadDemo {

	private static final int NUM_PAGES = 4;

	public static void main(String[] args) {
		ElectronicSecureNotepad imp = ElectronicSecureNotepad.getInstance(NUM_PAGES, "SecureNotepad");

		if (imp != null) {
			
			for(int i = 0; i < NUM_PAGES;i++){
				imp.addText("very nice" + i, i);
			}
			
			imp.seeAllPages();
		}

	}

}
