package com.bodyTask.model;

public class UpperBody {
	
	private String shoulder;
	private Arm arm;

	
	@Override
	public String toString(){
		return "Shoulders' width: " + getShoulder() + ", "+getArm();
	}


	public String getShoulder() {
		return shoulder;
	}


	public void setShoulder(String shoulder) {
		this.shoulder = shoulder;
	}


	public Arm getArm() {
		return arm;
	}


	public void setArm(Arm arm) {
		this.arm = arm;
	}
}
