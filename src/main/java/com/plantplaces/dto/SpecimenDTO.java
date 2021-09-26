package com.plantplaces.dto;

/**
 * Contains information about a given specimen
 * @author Bradley
 *
 */
public class SpecimenDTO {
	
	private int specimenID;
	private String latitude;
	private String longitude;
	private String description;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getSpecimenID() {
		return specimenID;
	}
	public void setSpecimenID(int specimenID) {
		this.specimenID = specimenID;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	public String toString() {
		return specimenID + " " + latitude + " " + longitude + " " + description;
	}


}
