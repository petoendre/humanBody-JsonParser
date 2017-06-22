package com.bodyTask.model;

public class HumanBody {

	private Head head;
	private UpperBody upperBody;
	private LowerPartOfBody lowerPartOfBody;

	public Head getHead() {
		return head;
	}


	public void setHead(Head head) {
		this.head = head;
	}


	public UpperBody getUpperBody() {
		return upperBody;
	}


	public void setUpperBody(UpperBody upperBody) {
		this.upperBody = upperBody;
	}


	public LowerPartOfBody getLowerPartOfBody() {
		return lowerPartOfBody;
	}


	public void setLowerPartOfBody(LowerPartOfBody lowerPartOfBody) {
		this.lowerPartOfBody = lowerPartOfBody;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("***** Body Details *****\n");
		sb.append("Head="+getHead()+"\n");
		sb.append("Upper body="+getUpperBody());
		sb.append("Lower part of body="+getLowerPartOfBody());
		sb.append("\n*****************************");
		
		return sb.toString();
	}
}
