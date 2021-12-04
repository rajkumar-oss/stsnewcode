package com.virtusa.json.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
public class DistributionPipeline {
@Id
	private int distributioneskey;
	private int DistributionPipelineId;
	private int DistributionProgramId;
	private String StatusCode;
	private boolean BuySell;
	private boolean promarysecondarydistribution;
	private boolean discusspipelinewithmarkets;
	private LocalDate hitmisseddate;
	private LocalDate estimatedclosingdate;
	private String mobilizationtypecode;
	private Double probabilitypercentage;
	private LocalDate enddate;
	private boolean fundedunfunded;
	private String comments;
	
	private List<FacilityDistributionPipeline> facilitydistributionpipeline;
	private List<Investors> investors;
	public int getDistributioneskey() {
		return distributioneskey;
	}
	public void setDistributioneskey(int distributioneskey) {
		this.distributioneskey = distributioneskey;
	}
	public int getDistributionPipelineId() {
		return DistributionPipelineId;
	}
	public void setDistributionPipelineId(int distributionPipelineId) {
		DistributionPipelineId = distributionPipelineId;
	}
	public int getDistributionProgramId() {
		return DistributionProgramId;
	}
	public void setDistributionProgramId(int distributionProgramId) {
		DistributionProgramId = distributionProgramId;
	}
	public String getStatusCode() {
		return StatusCode;
	}
	public void setStatusCode(String statusCode) {
		StatusCode = statusCode;
	}
	public boolean isBuySell() {
		return BuySell;
	}
	public void setBuySell(boolean buySell) {
		BuySell = buySell;
	}
	public boolean isPromarysecondarydistribution() {
		return promarysecondarydistribution;
	}
	public void setPromarysecondarydistribution(boolean promarysecondarydistribution) {
		this.promarysecondarydistribution = promarysecondarydistribution;
	}
	public boolean isDiscusspipelinewithmarkets() {
		return discusspipelinewithmarkets;
	}
	public void setDiscusspipelinewithmarkets(boolean discusspipelinewithmarkets) {
		this.discusspipelinewithmarkets = discusspipelinewithmarkets;
	}
	public LocalDate getHitmisseddate() {
		return hitmisseddate;
	}
	public void setHitmisseddate(LocalDate hitmisseddate) {
		this.hitmisseddate = hitmisseddate;
	}
	public LocalDate getEstimatedclosingdate() {
		return estimatedclosingdate;
	}
	public void setEstimatedclosingdate(LocalDate estimatedclosingdate) {
		this.estimatedclosingdate = estimatedclosingdate;
	}
	public String getMobilizationtypecode() {
		return mobilizationtypecode;
	}
	public void setMobilizationtypecode(String mobilizationtypecode) {
		this.mobilizationtypecode = mobilizationtypecode;
	}
	public Double getProbabilitypercentage() {
		return probabilitypercentage;
	}
	public void setProbabilitypercentage(Double probabilitypercentage) {
		this.probabilitypercentage = probabilitypercentage;
	}
	public LocalDate getEnddate() {
		return enddate;
	}
	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}
	public boolean isFundedunfunded() {
		return fundedunfunded;
	}
	public void setFundedunfunded(boolean fundedunfunded) {
		this.fundedunfunded = fundedunfunded;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public List<FacilityDistributionPipeline> getFacilitydistributionpipeline() {
		return facilitydistributionpipeline;
	}
	public void setFacilitydistributionpipeline(List<FacilityDistributionPipeline> facilitydistributionpipeline) {
		this.facilitydistributionpipeline = facilitydistributionpipeline;
	}
	public List<Investors> getInvestors() {
		return investors;
	}
	public void setInvestors(List<Investors> investors) {
		this.investors = investors;
	}
	
	
	
	
}
