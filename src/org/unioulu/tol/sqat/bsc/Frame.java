package org.unioulu.tol.sqat.bsc;

public class Frame {
	
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score(int j){
		int roll=0;int score=0;
		for(int i=0;i<j;i++){
			if(isStrike()){
				score+=10+bonus(roll);
				roll++;
			}
			else if(isSpare()){
				score+=10+bonus(roll);
				roll++;
			}
			else{
				score+=firstThrow+secondThrow;
			}
		}
		return score;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		//to be implemented
		return(firstThrow==10);
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		return (firstThrow+secondThrow==10);
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implementedrolle 	//return (BowligGame.Frameturnn==10);
		return false;
	}

	//bonus throws
	public int bonus(int m){
		return 0;
	}
}
