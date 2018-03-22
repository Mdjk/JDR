
public class InfoJeu {
	private int lvlPlayers;
	private String[] diceType = {"6", "8", "10", "20", "100"};
	private String[] encounterLvl = {"1", "2", "3"};
	private int actualPlayersLvl;
	private int actualDiceType;
	private int actualEncounterLvl;	
	
	public int getActualPlayersLvl() {
		return actualPlayersLvl;
	}
	public void setActualPlayersLvl(int actualPlayersLvl) {
		this.actualPlayersLvl = actualPlayersLvl;		
	}
	public int getActualDiceType() {
		return actualDiceType;
	}
	public void setActualDiceType(int actualDiceType) {
		this.actualDiceType = actualDiceType;
	}
	public int getActualEncounterLvl() {
		return actualEncounterLvl;
	}
	public void setActualEncounterLvl(int actualEncounterLvl) {
		this.actualEncounterLvl = actualEncounterLvl;
	}
	public int getLvlPlayers() {
		return lvlPlayers;
	}
	public void setLvlPlayers(int lvlPlayers) {
		this.lvlPlayers = lvlPlayers;
	}
	public String[] getDiceType() {
		return diceType;
	}
	public void setDiceType(String[] diceType) {
		this.diceType = diceType;
	}
	public String[] getEncounterLvl() {
		return encounterLvl;
	}
	public void setEncounterLvl(String[] encounterLvl) {
		this.encounterLvl = encounterLvl;
	}
	
	public InfoJeu(){
	}
}
