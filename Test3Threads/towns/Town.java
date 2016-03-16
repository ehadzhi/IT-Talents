package towns;

public class Town implements ITown {
	static private String[] towns = { "Sofia", "Varna", "Tyrnovo", "Ruse", "Plovdiv" };
	private int townID;
	
	
	/* (non-Javadoc)
	 * @see towns.ITown#getTown()
	 */
	@Override
	public String getTown(){
		return towns[townID];
	}
}
