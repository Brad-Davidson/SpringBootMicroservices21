package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;
import com.plantplaces.interfaces.ISpecimenService;

/**
 * Microservice class for Specimen related logic
 * @author Bradley
 *
 */
@Component
public class SpecimenServiceStub implements ISpecimenService {
	
	/**
	 * Fetch a given specimen by ID
	 * @param id id of specimen to fetch
	 * @return SpecimenDTO of a given specimen
	 */
	@Override
	public SpecimenDTO fetchByID(int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		
		//this should prob be set to the id parameter.
		specimenDTO.setSpecimenID(id);
		specimenDTO.setLatitude("40.75");
		specimenDTO.setLongitude("-75.60");
		specimenDTO.setDescription("A beautiful Eastern Redbud");
		
		return specimenDTO;
	}
	
	/**
	 * Saves a given specimen to a database/server/whatever we want
	 * @param specimen SpecimenDTO object to save
	 */
	@Override
	public void SaveSpecimen(SpecimenDTO specimen) {
		
	}
}
