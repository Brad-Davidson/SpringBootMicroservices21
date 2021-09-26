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
	private String imagePath;
	
	/**
	 * This constructor is just to make inline object creation easier
	 * @param specimenID ID of specimen
	 * @param latitude latitude of where the specimen is located
	 * @param longitude longitude of where the specimen is located
	 * @param description short description of the specimen
	 * @param imagePath path to the image of the specimen
	 */
	public SpecimenDTO(int specimenID, String latitude, String longitude, String description, String imagePath) {
		this.specimenID = specimenID;
		this.latitude = latitude;
		this.longitude = longitude;
		this.description = description;
		this.imagePath = imagePath;
	}
	
	public SpecimenDTO() {
		
	}
	
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
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getImagePath() {
		return this.imagePath;
	}
	
	public String toString() {
		return specimenID + " " + latitude + " " + longitude + " " + description;
	}


}
