package model;
import java.util.*;

public class Player {
	
	private String playerName;
	private Team playerTeam;
	private int score,no_of_4s,no_of_6s,balls,wickerTaken,overbowled,run_conceded,maiden_over,dot_bolls,last_over_balls;
	private List<PlayerType> playerResponsibility;
	
	
	public int getLast_over_balls() {
		return last_over_balls;
	}

	public void setLast_over_balls(int last_over_balls) {
		this.last_over_balls = last_over_balls;
	}

	public Player(String playerName, Team playerTeam)
	{
		this.playerName=playerName;
		this.playerTeam=playerTeam;
		this.score=0;
		this.no_of_4s=0;
		this.no_of_6s=0;
		this.balls=0;
		this.wickerTaken=0;
		this.overbowled=0;
		this.run_conceded=0;
		this.maiden_over=0;
		this.dot_bolls=0;
		this.last_over_balls=0;
		playerResponsibility=new ArrayList<>();
		
	
	}
	
	public int getWickerTaken() {
		return wickerTaken;
	}

	public void setWickerTaken(int wickerTaken) {
		this.wickerTaken = wickerTaken;
	}

	public int getOverbowled() {
		return overbowled;
	}

	public void setOverbowled(int overbowled) {
		this.overbowled = overbowled;
	}

	public int getRun_conceded() {
		return run_conceded;
	}

	public void setRun_conceded(int run_conceded) {
		this.run_conceded = run_conceded;
	}

	public int getMaiden_over() {
		return maiden_over;
	}

	public void setMaiden_over(int maiden_over) {
		this.maiden_over = maiden_over;
	}

	public int getDot_bolls() {
		return dot_bolls;
	}

	public void setDot_bolls(int dot_bolls) {
		this.dot_bolls = dot_bolls;
	}
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Team getPlayerTeam() {
		return playerTeam;
	}

	public void setPlayerTeam(Team playerTeam) {
		this.playerTeam = playerTeam;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getNo_of_4s() {
		return no_of_4s;
	}

	public void setNo_of_4s(int no_of_4s) {
		this.no_of_4s = no_of_4s;
	}

	public int getNo_of_6s() {
		return no_of_6s;
	}

	public void setNo_of_6s(int no_of_6s) {
		this.no_of_6s = no_of_6s;
	}

	public int getBalls() {
		return balls;
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Player p= (Player)o;
		
		return p.playerName.equals(this.playerName);
		
	}
	
	public String toStringBatsMan() {
		
		
		return this.playerName+"        "+this.score+"    "+this.no_of_4s+"    "+this.no_of_6s+"    "+this.balls;
		
	}
	
    public String toStringBowler() {
		
		return this.playerName+"          "+this.wickerTaken+"         "+this.overbowled+"."+this.last_over_balls+"         "+this.run_conceded+"         "+this.maiden_over+"         "+this.dot_bolls;
		
	}


	
	
	
	

}
