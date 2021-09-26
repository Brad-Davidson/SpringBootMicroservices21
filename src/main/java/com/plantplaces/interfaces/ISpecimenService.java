package com.plantplaces.interfaces;

import com.plantplaces.dto.SpecimenDTO;

/**
 * CRUD Operations for Specimens
 * @author Bradley
 *
 */
public interface ISpecimenService {

	/**
	 * Fetch a given specimen by ID from the persistence layer
	 * @param id id of specimen to fetch
	 * @return SpecimenDTO of a given specimen
	 */
	SpecimenDTO fetchByID(int id);

	/**
	 * Saves a given specimen to the persistence layer
	 * @param specimen SpecimenDTO object to save
	 */
	void SaveSpecimen(SpecimenDTO specimen);

}