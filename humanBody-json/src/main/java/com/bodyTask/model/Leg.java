package com.bodyTask.model;

import java.util.Arrays;

public class Leg {
	
	private long[] thigh;
	private long[] calf;
	private long foot;


	
	@Override
	public String toString(){
		return "Thighs' size: " + Arrays.toString(getThigh()) + ", Calves' size: "+ Arrays.toString(getCalf())+", Feet's size: "+getFoot();
	}



	public long[] getThigh() {
		return thigh;
	}



	public void setThigh(long[] thigh) {
		this.thigh = thigh;
	}



	public long[] getCalf() {
		return calf;
	}



	public void setCalf(long[] calf) {
		this.calf = calf;
	}



	public long getFoot() {
		return foot;
	}



	public void setFoot(long foot) {
		this.foot = foot;
	}

}
