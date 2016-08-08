package fr.hamtee.tennisScore.manager;

public class MatchManager {
	
	private Player player1;
	
	private Player player2;
	
	private Set set;


	//Constructor
	public MatchManager(Player player1, Player player2, Set set) {
		
		this.player1 = player1;
		this.player2 = player2;
		this.set = set;
		
	}

	//Methods
	/**
	 * 
	 */
	public void player1scores(){
		
		if(this.set.isTiebreak()){
			this.set.incrementTiebreakPoint(this.player1);
			this.set.setDiff(Math.abs(this.player1.getTiebreakPoint() - this.player2.getTiebreakPoint()) >= 2);
			
			if(player1.getTiebreakPoint() >= 6 && this.set.isDiff()){
				this.set.setEndSet(true);
				this.player1.setWin(true);
			}
			
		}else{
			this.set.incrementSequence(this.player1);
			this.set.setDiff(Math.abs(this.player1.getPoint() - this.player2.getPoint()) >= 2);
			
			if(player1.getPoint() >= 6 && this.set.isDiff()){
				this.set.setEndSet(true);
				this.player1.setWin(true);
			}
			
			this.set.setDeuce(this.player2.getSequence() == 40 && this.player1.getSequence() == 40);
			this.set.setTiebreak(this.player1.getPoint() == 6 && this.player2.getPoint() == 6);
		}
		
	}
	
	/**
	 * 
	 */
	public void player2scores(){
		
		if(this.set.isTiebreak()){
			this.set.incrementTiebreakPoint(this.player2);
			this.set.setDiff(Math.abs(this.player1.getTiebreakPoint() - this.player2.getTiebreakPoint()) >= 2);
			
			if(player2.getTiebreakPoint() >= 6 && this.set.isDiff()){
				this.set.setEndSet(true);
				this.player2.setWin(true);
			}
			
		}else{
			this.set.setDiff(Math.abs(this.player1.getPoint() - this.player2.getPoint()) >= 2);
			this.set.incrementSequence(this.player2);
			
			if(player2.getPoint() >= 6 && this.set.isDiff()){
				this.set.setEndSet(true);
				this.player2.setWin(true);
			}
			
			this.set.setDeuce(this.player2.getSequence() == 40 && this.player1.getSequence() == 40);
			this.set.setTiebreak(this.player1.getPoint() == 6 && this.player2.getPoint() == 6);
		}
		
	}
	
	/**
	 * 
	 * @return
	 */
	public String getScore(){
		
		if(this.set.isDeuce()){
			
			if(player1.isAdvantage()){
				return "deuce: advantage " + this.player1;
			}else if(player2.isAdvantage()){
				return "deuce: advantage " + this.player2;
			}else{
				return "deuce";
			}
			
		}else if(this.set.isTiebreak()){
			
			return "tiebreak: " + this.player1.getTiebreakPoint() + " - " + this.player2.getTiebreakPoint();
			
		}else{
		
			return this.player1.getPoint() + " - " + player2.getPoint();
			
		}	
	}
	

	/**
	 * 
	 * @return
	 */
	public Player whoWins(){
		
		if(this.set.isEndSet()){
			
			if(this.player1.isWin()){
				return player1;
			}else if(this.player2.isWin()){
				return this.player2;
			}else{
				return null;
			}
			
		}else{
			
			return null;
			
		}
		
	}
	
	
	//Setters
	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}
	
}
