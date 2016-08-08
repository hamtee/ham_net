package fr.hamtee.tennisScore.manager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatchManagerTest {
	
	Player player1 = new Player();
	Player player2 = new Player();
	Set set = new Set();
	MatchManager manager;

	@Before
	public void beforeMatchManagerTest(){
		manager = new MatchManager(player1, player2, set);
	}
	
	@Test
	public void shouldPlayerWinFifteenSequence(){
		for(int i=0; i<1; i++){
			manager.player1scores();
		}
		Assert.assertEquals(15, player1.getSequence());
	}
	
	@Test
	public void shouldPlayerWinThirtySequence(){
		for(int i=0; i<2; i++){
			manager.player1scores();
		}
		Assert.assertEquals(30, player1.getSequence());
	}
	
	@Test
	public void shouldPlayerWinFortySequence(){
		for(int i=0; i<3; i++){
			manager.player1scores();
		}
		Assert.assertEquals(40, player1.getSequence());
	}
	
	@Test
	public void shouldGameDeuce(){
		for(int i=0; i<3; i++){
			manager.player1scores();
			manager.player2scores();
		}
		Assert.assertTrue(set.isDeuce());
	}
	
	@Test
	public void shouldGameDeuceAdvantagePlayer1(){
		for(int i=0; i<3; i++){
			manager.player1scores();
			manager.player2scores();
		}
		manager.player1scores();
		Assert.assertTrue(player1.isAdvantage());
		Assert.assertFalse(player2.isAdvantage());
	}
	
	@Test
	public void shouldPlayer1WinPointAfterAdvantage(){
		for(int i=0; i<3; i++){
			manager.player1scores();
			manager.player2scores();
		}
		manager.player1scores();
		manager.player1scores();
		
		Assert.assertFalse(player1.isAdvantage());
		Assert.assertFalse(player2.isAdvantage());
		Assert.assertFalse(set.isDeuce());
		Assert.assertTrue("1 - 0".equals(manager.getScore()));
	}
	
	@Test
	public void shouldPlayer1WinSet(){
		manager.getPlayer1().setPoint(5);
		manager.getPlayer2().setPoint(4);
		
		for(int i=0; i<4; i++){
			manager.player1scores();
		}
		
		Assert.assertTrue("6 - 4".equals(manager.getScore()));
		Assert.assertTrue(player1.isWin());
		Assert.assertTrue(set.isEndSet());
		
	}
	
	@Test
	public void shouldSetTiebreak(){
		manager.getPlayer1().setPoint(5);
		manager.getPlayer2().setPoint(6);
		
		for(int i=0; i<4; i++){
			manager.player1scores();
		}
		
		Assert.assertTrue("tiebreak: 0 - 0".equals(manager.getScore()));
		Assert.assertTrue(set.isTiebreak());
		Assert.assertFalse(set.isEndSet());
		
	}
	
	@Test
	public void shouldPlayer1WinTiebreak(){
		manager.getSet().setTiebreak(true);
		
		manager.getPlayer1().setPoint(6);
		manager.getPlayer2().setPoint(6);
		
		manager.getPlayer1().setTiebreakPoint(6);
		manager.getPlayer2().setTiebreakPoint(5);
		
		manager.player1scores();
		
		Assert.assertTrue("tiebreak: 7 - 5".equals(manager.getScore()));
		Assert.assertTrue(player1.isWin());
		Assert.assertTrue(set.isEndSet());
		
	}
}
