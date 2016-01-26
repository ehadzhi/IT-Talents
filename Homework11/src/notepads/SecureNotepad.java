package notepads;

import java.util.Scanner;

public class SecureNotepad extends SimpleNotepad implements INotepad {
	private static final int PASSWORD_MIN_LENGTH = 5;
	private final static Scanner sc = new Scanner(System.in);
	private final String passsword;

	protected SecureNotepad(int numPages, String name, String password) {
		super(numPages, name);
		this.passsword = password;
	}

	public static SecureNotepad getInstance(int numPages, String name) {
		String password = setupPassword(name);

		boolean checkInput = numPages > 0 && name != null
				&& !name.equals("") && password != null;
		if (checkInput) {
			return new SecureNotepad(numPages, name, password);
		}
		return null;
	}

	@Override
	public boolean addText(String toAdd, int pageNum) {
		if (getCorrectPassword()) {
			return super.textEdit(toAdd, pageNum, 2);
		}
		return false;
	}

	@Override
	public boolean replaceText(String toReplace, int pageNum) {
		if (getCorrectPassword()) {
			return super.textEdit(toReplace, pageNum, 1);
		}
		return false;
	}

	@Override
	public boolean deleteText(int pageNum) {
		if (getCorrectPassword()) {
			return textEdit("", pageNum, 3);
		}
		return false;
	}

	@Override
	public void seeAllPages() {
		if (getCorrectPassword()) {
			super.seeAllPages();
		}
	}

	private static boolean checkValidPassword(String password) {
		boolean hasLowerCase = false;
		boolean hasUpperCase = false;
		boolean hasDigit = false;
		char currentChar;
		
		if( password.length() <= PASSWORD_MIN_LENGTH){
			return false;
		}
		
		for (int index = 0; index < password.length(); index++) {
			currentChar =  password.charAt(index);
			 if (Character.isDigit(currentChar) ){
				 hasDigit = true;
			}
			 if(Character.isLowerCase(currentChar)){
				 hasLowerCase = true;
			 }
			 if( Character.isUpperCase(currentChar)){
				 hasUpperCase = true;
			 }
			 if( hasDigit && hasLowerCase && hasUpperCase){
				 return true;
			 }
		}
		return false;
	}

	protected static String setupPassword(String name) {
		String password;
//		 variant for trying multiple passwords
//		do{				
//			System.out.println("Create pass for " + name);
//			password = getPassword();
//		}while( !checkValidPassword(password) );
		
		System.out.println("Create pass for " + name);
		password = getPassword();
		if( checkValidPassword(password) ){
			System.out.println("Suitable password");
		}
		else{
			System.out.println("Not a sutable password");
			password = null;
		}
		return password;
	}

	protected static String getPassword() {
		String password = "";
		while (password.equals("")) {
			System.out.print("Enter password : ");
			password = sc.nextLine();
		}
		return password;
	}

	protected boolean getCorrectPassword() {
		System.out.println(this.name + ". ");
		boolean isCorrectPass = this.passsword.equals(getPassword());
		if (isCorrectPass) {
			System.out.println("Correct password");
		} else {
			System.out.println("Incorrect password");
		}
		System.out.println();
		return isCorrectPass;
	}
}
