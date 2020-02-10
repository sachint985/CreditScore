package com.creditscore.model;

public class Pan {
	private String pan;
	private double score;
	public Pan(String pan, double score) {
		super();
		this.pan = pan;
		this.score = score;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
}
