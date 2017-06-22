package com.bodyTask.model;

import java.util.Arrays;

public class Arm {
	
	private long[] upperArm;
	private long[] forearm;
	private String hand;


	
	@Override
	public String toString(){
		return "Arms' size: " + Arrays.toString(getUpperArm()) + ", Hands' type:  "+getHand()+", Forearms' size: "+Arrays.toString(getForearm())+"\n";
	}


	public long[] getUpperArm() {
		return upperArm;
	}



	public void setUpperArm(long[] upperArm) {
		this.upperArm = upperArm;
	}



	public String getHand() {
		return hand;
	}



	public void setHand(String hand) {
		this.hand = hand;
	}



	public long[] getForearm() {
		return forearm;
	}



	public void setForearm(long[] forearm) {
		this.forearm = forearm;
	}
}
