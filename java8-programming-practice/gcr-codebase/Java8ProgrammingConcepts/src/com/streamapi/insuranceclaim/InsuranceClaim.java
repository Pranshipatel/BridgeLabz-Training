package com.streamapi.insuranceclaim;

public class InsuranceClaim {
	private String claimType;
	private double claimAmout;
	
	public InsuranceClaim(String claimType, double claimAmout) {
		super();
		this.claimType = claimType;
		this.claimAmout = claimAmout;
	}

	public String getClaimType() {
		return claimType;
	}

	public double getClaimAmout() {
		return claimAmout;
	}

	
}
