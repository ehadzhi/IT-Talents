package providers;

import helpers.StringChecker;

public abstract class Provider implements IProvider {
	private String name;
	private String addres;
	private String workTime;

	public Provider(String name, String addres, String workTime) {
		if (StringChecker.checkString(name) && StringChecker.checkString(addres)
				&& StringChecker.checkString(workTime)) {
			this.name = name;
			this.addres = addres;
			this.workTime = workTime;
		}
	}

}
