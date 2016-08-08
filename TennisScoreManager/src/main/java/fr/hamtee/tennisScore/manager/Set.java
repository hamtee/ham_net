package fr.hamtee.tennisScore.manager;

public class Set {
	
	private boolean deuce = false;
	
	private boolean tiebreak = false;
	
	private boolean diff = false;
	
	private boolean endSet = false;
	
	
	//Constructor
	public Set() {
		
	}

	
	//Methods
	/**
	 * 
	 * @param player
	 */
	public void incrementSequence(Player player){
		
		switch (player.getSequence()) {
		
		case 0:
			player.setSequence(15);
			break;
		
		case 15:
			player.setSequence(30);
			break;

		case 30:
			player.setSequence(40);
			break;
		
		case 40:
			if(this.deuce){
				player.setSequence(99);
				player.setAdvantage(true);
			
			}else{
				player.setSequence(0);
				this.incrementPoint(player);
			
			}
			break;	
			
		case 99:
			if(player.isAdvantage()){
				player.setSequence(0);
				this.incrementPoint(player);
				player.setAdvantage(false);
				this.setDeuce(false);
				
			}else{
				player.setAdvantage(false);
			}
			break;
		}
		
	}
	
	/**
	 * 
	 * @param player
	 */
	public void incrementPoint(Player player){
		
		switch (player.getPoint()) {
		
		case 0:
			player.setPoint(1);
			break;
			
		case 1:
			player.setPoint(2);
			break;
			
		case 2:
			player.setPoint(3);
			break;
			
		case 3:
			player.setPoint(4);
			break;
			
		case 4:
			player.setPoint(5);
			break;
			
		case 5:
			player.setPoint(6);
			break;
			
		case 6:
			if(!this.isEndSet()){
				player.setPoint(7);
			}
			break;	
			
		default:
			break;
		}
	}
	
	/**
	 * 
	 * @param player
	 */
	public void incrementTiebreakPoint(Player player){
		
		player.setTiebreakPoint(player.getTiebreakPoint()+1);

	}
	
	//Setters and Getters
	
	/**
	 * 
	 * @return
	 */
	public boolean isDeuce() {
		return deuce;
	}

	/**
	 * 
	 * @param deuce
	 */
	public void setDeuce(boolean deuce) {
		this.deuce = deuce;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isDiff() {
		return diff;
	}

	/**
	 * 
	 * @param diff
	 */
	public void setDiff(boolean diff) {
		this.diff = diff;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isEndSet() {
		return endSet;
	}

	/**
	 * 
	 * @param endSet
	 */
	public void setEndSet(boolean endSet) {
		this.endSet = endSet;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isTiebreak() {
		return tiebreak;
	}

	/**
	 * 
	 * @param tiebreak
	 */
	public void setTiebreak(boolean tiebreak) {
		this.tiebreak = tiebreak;
	}
	
	
	
}
