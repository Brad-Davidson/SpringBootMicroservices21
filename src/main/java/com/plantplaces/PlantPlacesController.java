/**
 * 
 */
package com.plantplaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.plantplaces.dto.SpecimenDTO;
import com.plantplaces.interfaces.ISpecimenService;

/**
 * @author Bradley Davidson
 *
 * Controller for demo spring boot project
 */
@Controller
public class PlantPlacesController {
	
	@Autowired
	private ISpecimenService specimenServiceStub;

	/**
	 * 
	 * @return returns the start.html template
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read(Model model) { 
		SpecimenDTO specimen = specimenServiceStub.fetchByID(41);
		model.addAttribute("specimen", specimen);
		return "start";
	}
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"loyalty=blue"})
	public String readBlue(Model model) {
		SpecimenDTO specimen = specimenServiceStub.fetchByID(43);
		model.addAttribute("specimen", specimen);
		return "start";
	}
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"loyalty=silver"})
	public ModelAndView readSilver() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("start");
		modelAndView.addObject("specimen", specimenServiceStub.fetchByID(42));
		return modelAndView;
	}
	
	@RequestMapping(value="/start", method = RequestMethod.GET, headers= {"content-type=text/json"})
	public String readJson(Model model) {
		SpecimenDTO specimen = specimenServiceStub.fetchByID(44);
		model.addAttribute("specimen", specimen);
		return "start";
	}
	
	/**
	 * Test of post mapping
	 * @return the start.html template
	 */
	@PostMapping("/start")
	public String create(Model model) {
		SpecimenDTO specimen = specimenServiceStub.fetchByID(45);
		model.addAttribute("specimen", specimen);
		return "start";
	}
	
	//default address for our project
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
