package com.virtusa.json.model;

import java.util.List;

public class Investors {

	private int distributionepipelineid;
	private int clientid;
	private String investortypepolarcode;
	private Double participationpercentage;
	private int soldby;
	private String coveragejgeographycode;
	private Double distributionamount;
	
	private List<FeeRecognition> feerecognition;

	public int getDistributionepipelineid() {
		return distributionepipelineid;
	}

	public void setDistributionepipelineid(int distributionepipelineid) {
		this.distributionepipelineid = distributionepipelineid;
	}

	public int getClientid() {
		return clientid;
	}

	public void setClientid(int clientid) {
		this.clientid = clientid;
	}

	public String getInvestortypepolarcode() {
		return investortypepolarcode;
	}

	public void setInvestortypepolarcode(String investortypepolarcode) {
		this.investortypepolarcode = investortypepolarcode;
	}

	public Double getParticipationpercentage() {
		return participationpercentage;
	}

	public void setParticipationpercentage(Double participationpercentage) {
		this.participationpercentage = participationpercentage;
	}

	public int getSoldby() {
		return soldby;
	}

	public void setSoldby(int soldby) {
		this.soldby = soldby;
	}

	public String getCoveragejgeographycode() {
		return coveragejgeographycode;
	}

	public void setCoveragejgeographycode(String coveragejgeographycode) {
		this.coveragejgeographycode = coveragejgeographycode;
	}

	public Double getDistributionamount() {
		return distributionamount;
	}

	public void setDistributionamount(Double distributionamount) {
		this.distributionamount = distributionamount;
	}

	public List<FeeRecognition> getFeerecognition() {
		return feerecognition;
	}

	public void setFeerecognition(List<FeeRecognition> feerecognition) {
		this.feerecognition = feerecognition;
	}
	
	
	
	
	
}
