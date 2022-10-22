package com.wiszenkoigor.fleetapp.controllers;

import java.util.List;
import java.util.Optional;

import com.wiszenkoigor.fleetapp.models.Country;
import com.wiszenkoigor.fleetapp.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	//Get All Countries
	@GetMapping("/countries")
	public String getCountries(Model model){
		List<Country> countryList = countryService.getCountries();
		model.addAttribute("countries",countryList);
		return "Country";
	}	
	
	@RequestMapping("/countries/findById")
	@ResponseBody
	public Optional<Country> findById(Integer id)
	{
		return countryService.findById(id);
	}
	
	//Add Country
	@PostMapping(value="countries/addNew")
	public String addNew(Country country) {
		countryService.save(country);
		return "redirect:/countries";
	}	
	
	@RequestMapping(value="countries/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Country country) {
		countryService.save(country);
		return "redirect:/countries";
	}
	
	@RequestMapping(value="countries/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		countryService.delete(id);
		return "redirect:/countries";
	}
}
