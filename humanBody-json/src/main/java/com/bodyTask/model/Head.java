package com.bodyTask.model;

public class Head {
	
	private String eye;
	private String ear;
	private String mouth;
	
	public String getEye() {
		return eye;
	}
	public void setEye(String eye) {
		this.eye = eye;
	}
	public String getEar() {
		return ear;
	}
	public void setEar(String ear) {
		this.ear = ear;
	}
	public String getMouth() {
		return mouth;
	}
	public void setMouth(String mouth) {
		this.mouth = mouth;
	}
	
	@Override
	public String toString(){
		return "Eyes' color:" + getEye() + ", Ears' type: "+getEar()+", Mouth's type: "+getMouth();
	}
}
