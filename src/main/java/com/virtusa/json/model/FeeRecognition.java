package com.virtusa.json.model;

import java.time.LocalDate;

public class FeeRecognition {

	private int feeid;
	private String facilityid;
	private int distributionpipelineid;
	private int clientid;
	private boolean idpdmdfee;
	private String typecode;
	private boolean iscurrency;
	private String currencycode;
	private Double amountkbps;
	private boolean ispaidrecieved;
	private String frequencycode;
	private LocalDate startdate;
	private LocalDate enddate;
	public int getFeeid() {
		return feeid;
	}
	public void setFeeid(int feeid) {
		this.feeid = feeid;
	}
	public String getFacilityid() {
		return facilityid;
	}
	public void setFacilityid(String facilityid) {
		this.facilityid = facilityid;
	}
	public int getDistributionpipelineid() {
		return distributionpipelineid;
	}
	public void setDistributionpipelineid(int distributionpipelineid) {
		this.distributionpipelineid = distributionpipelineid;
	}
	public int getClientid() {
		return clientid;
	}
	public void setClientid(int clientid) {
		this.clientid = clientid;
	}
	public boolean isIdpdmdfee() {
		return idpdmdfee;
	}
	public void setIdpdmdfee(boolean idpdmdfee) {
		this.idpdmdfee = idpdmdfee;
	}
	public String getTypecode() {
		return typecode;
	}
	public void setTypecode(String typecode) {
		this.typecode = typecode;
	}
	public boolean isIscurrency() {
		return iscurrency;
	}
	public void setIscurrency(boolean iscurrency) {
		this.iscurrency = iscurrency;
	}
	public String getCurrencycode() {
		return currencycode;
	}
	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}
	public Double getAmountkbps() {
		return amountkbps;
	}
	public void setAmountkbps(Double amountkbps) {
		this.amountkbps = amountkbps;
	}
	public boolean isIspaidrecieved() {
		return ispaidrecieved;
	}
	public void setIspaidrecieved(boolean ispaidrecieved) {
		this.ispaidrecieved = ispaidrecieved;
	}
	public String getFrequencycode() {
		return frequencycode;
	}
	public void setFrequencycode(String frequencycode) {
		this.frequencycode = frequencycode;
	}
	public LocalDate getStartdate() {
		return startdate;
	}
	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}
	public LocalDate getEnddate() {
		return enddate;
	}
	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}
	
	
	
	
}
