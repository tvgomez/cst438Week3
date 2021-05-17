package cst438.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import cst438.domain.CityInfo;
import cst438.services.CityService;

@Controller
public class CityController {
	
	@Autowired
	CityService CityService;
	
	@GetMapping("/cities/{city}")
	public String getCityInfo(@PathVariable("city") String cityName, Model model) {
		CityInfo city = CityService.getCityInfo(cityName);
		model.addAttribute("city", city);
		return "city_show";
	}
	
	@PostMapping("/cities/reservation")
	public String createReservation(
			@RequestParam("city") String cityName,
			@RequestParam("level") String level,
			@RequestParam("email") String email,
			Model model) {
		model.addAttribute("city", cityName);
		model.addAttribute("level", level);
		model.addAttribute("email", email);
		CityService.requestReservation(cityName,level,email);
		return "request_reservation";
		
	}

}