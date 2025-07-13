package com.sunbeam.p1;

public enum AccountType {
	SAV(2.5), CUR(1.5), DEMAT(0);
	
	private double roi;
	
	private AccountType(double roi) {
		this.roi = roi;
	}
	
	public double getRoi() {
		return roi;
	}
}
