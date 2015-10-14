package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	public static int Frameturn = 0;
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	public static void main(String arg[]){
		BowlingGame bg=new BowlingGame();
		Frame fe=new Frame(0, 0);
		
		bg.addFrame(null);//ready to start
	}
	public BowlingGame(){
		
	}
	
	public void addFrame(Frame frame){
		//to be implemented
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		if (!isNextFrameBonus()){
			
		}
	}
	
	public int score(){
		//to be implemented
		return score();
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
