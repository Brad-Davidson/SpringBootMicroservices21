/**
 * 
 */
package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Bradley Davidson
 *
 * Controller for demo spring boot project
 */
@Controller
public class PlantPlacesController {

	/**
	 * 
	 * @return returns the start.html template
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read() {
		return "start";
	}
	
	/**
	 * Test of post mapping
	 * @return the start.html template
	 */
	@PostMapping("/start")
	public String create() {
		return "start";
	}
}
