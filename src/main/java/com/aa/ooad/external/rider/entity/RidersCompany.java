package com.aa.ooad.external.rider.entity;

import java.util.List;

public class RidersCompany {

	private String companyId;
	private String companyName;
	private String zipCode;
	private List<Rider> riderList;
	
	public RidersCompany(String companyId, String companyName, String zipCode, List<Rider> riderList) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.zipCode = zipCode;
		this.riderList = riderList;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public List<Rider> getRiderList() {
		return riderList;
	}
	public void setRiderList(List<Rider> riderList) {
		this.riderList = riderList;
	}
	
}
