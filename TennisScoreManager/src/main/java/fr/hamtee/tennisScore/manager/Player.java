package fr.hamtee.tennisScore.manager;

public class Player {
	
	private boolean advantage = false;
	
	private boolean win = false;
	
	private int sequence = 0;
	
	private int point = 0;
	
	private int tiebreakPoint = 0;
	
	//Constructor
	public Player(){
		
	}
	
	//Methods
	
	
	

	//Getters and setters
	
	/**
	 * 
	 * @return
	 */
	public int getSequence() {
		return sequence;
	}
	
	/**
	 * 
	 * @param sequence
	 */
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isAdvantage() {
		return advantage;
	}

	/**
	 * 
	 * @param advantage
	 */
	public void setAdvantage(boolean advantage) {
		this.advantage = advantage;
	}

	/**
	 * 
	 * @return
	 */
	public int getPoint() {
		return point;
	}

	/**
	 * 
	 * @param point
	 */
	public void setPoint(int point) {
		this.point = point;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isWin() {
		return win;
	}
	
	/**
	 * 
	 * @param win
	 */
	public void setWin(boolean win) {
		this.win = win;
	}

	/**
	 * 
	 * @return
	 */
	public int getTiebreakPoint() {
		return tiebreakPoint;
	}

	/**
	 * 
	 * @param tiebreakPoint
	 */
	public void setTiebreakPoint(int tiebreakPoint) {
		this.tiebreakPoint = tiebreakPoint;
	}
	
	

}
