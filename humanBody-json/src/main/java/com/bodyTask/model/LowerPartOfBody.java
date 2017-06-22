package com.bodyTask.model;

public class LowerPartOfBody {
	
	private Leg leg;

	
	@Override
	public String toString(){
		return getLeg()+" ";
	}


	public Leg getLeg() {
		return leg;
	}


	public void setLeg(Leg leg) {
		this.leg = leg;
	}


}
