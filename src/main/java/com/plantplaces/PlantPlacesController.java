/**
 * 
 */
package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	@RequestMapping("/start")
	public String start() {
		return "start";
	}
}
