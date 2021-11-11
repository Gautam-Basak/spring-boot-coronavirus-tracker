package io.javaminds.application.models;

public class LocationStats {
	
	private String states;
	private String country;
	private int latestTotalCases;
	private int diffFromPreDay;
	
	
	
	public String getStates() {
		return states;
	}
	public void setStates(String states) {
		this.states = states;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestTotalCases() {
		return latestTotalCases;
	}
	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}
	public int getDiffFromPreDay() {
		return diffFromPreDay;
	}
	public void setDiffFromPreDay(int diffFromPreDay) {
		this.diffFromPreDay = diffFromPreDay;
	}
	
	
	
	@Override
	public String toString() {
		return "LocationStats [states=" + states + ", country=" + country + ", latestTotalCases=" + latestTotalCases
				+ ", diffFromPreDay=" + diffFromPreDay + "]";
	}	

}
