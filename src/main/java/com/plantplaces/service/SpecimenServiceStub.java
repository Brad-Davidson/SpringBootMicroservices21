package com.plantplaces.service;

import java.util.ArrayList;

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
	
	private ArrayList<SpecimenDTO> specimenList = new ArrayList<SpecimenDTO>();
	
	/**
	 * initialize a local list of specimens. This should come for the persistence layer later
	 */
	public SpecimenServiceStub() {
		specimenList.add(new SpecimenDTO(41, "42.63", "75.15", "Eastern Redbud", "~/assets/eastern redbud.jpg"));
		specimenList.add(new SpecimenDTO(42, "61.63", "12.15", "Oak Tree", "~/assets/oak.jpg"));
		specimenList.add(new SpecimenDTO(43, "51.41", "31.11", "A less cool Eastern Redbud", "~/assets/eastern redbud.jpg"));
		specimenList.add(new SpecimenDTO(44, "12.45", "34.21", "The same Oak Tree", "~/assets/oak.jpg"));
		specimenList.add(new SpecimenDTO(45, "67.63", "17.15", "A big Oak Tree", "~/assets/oak.jpg"));
	}
	
	/**
	 * Fetch a given specimen by ID
	 * @param id id of specimen to fetch
	 * @return SpecimenDTO of a given specimen
	 */
	@Override
	public SpecimenDTO fetchByID(int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		
		for(SpecimenDTO specimen : specimenList) {
			if(specimen.getSpecimenID() == id) {
				return specimen;
			}
		}
		
		return new SpecimenDTO();
	}
	
	/**
	 * Saves a given specimen to a database/server/whatever we want
	 * @param specimen SpecimenDTO object to save
	 */
	@Override
	public void SaveSpecimen(SpecimenDTO specimen) {
		
	}
}
