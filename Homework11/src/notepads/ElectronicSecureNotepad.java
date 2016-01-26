package notepads;

public class ElectronicSecureNotepad extends SecureNotepad implements IElectronicDevice, INotepad {

	private boolean isOn;

	protected ElectronicSecureNotepad(int numPages, String name, String password) {
		super(numPages, name, password);
		isOn = true;
	}
	
	public static ElectronicSecureNotepad getInstance(int numPages,String name){
		String password = setupPassword(name);

		boolean checkInput = numPages > 0 && name != null
				&& !name.equals("") && password != null;
		if (checkInput) {
			return new ElectronicSecureNotepad(numPages, name, password);
		}
		return null;
	}

	@Override
	public void start() {
		isOn = true;
	}

	@Override
	public void stop() {
		isOn = false;
	}

	@Override
	public boolean isStarted() {
		return isOn;
	}

	@Override
	public boolean addText(String toAdd, int pageNum) {
		if (isStarted()) {
			return super.addText(toAdd, pageNum);
		}
		return false;
	}

	@Override
	public boolean replaceText(String toReplace, int pageNum) {
		if (isStarted()) {
			return super.replaceText(toReplace, pageNum);
		}
		return false;
	}

	@Override
	public boolean deleteText(int pageNum) {
		if (isStarted()) {
			return super.deleteText(pageNum);
		}
		return false;
	}

	@Override
	public void seeAllPages() {
		if (isStarted()) {
			super.seeAllPages();
		}
	}

	@Override
	public int searchWord(String word) {
		if (isStarted()) {
			return super.searchWord(word);
		}
		return -1;
	}

	@Override
	public void printAllPagesWithDigits() {
		if (isStarted()) {
			super.printAllPagesWithDigits();
		}
	}

}
