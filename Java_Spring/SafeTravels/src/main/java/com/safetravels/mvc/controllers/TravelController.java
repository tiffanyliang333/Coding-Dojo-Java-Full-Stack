package com.safetravels.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.safetravels.mvc.models.Travel;
import com.safetravels.mvc.services.TravelService;


@Controller
public class TravelController {
	
	@Autowired
	private TravelService travelServe;
	
	@GetMapping("/")
	public String index(@ModelAttribute("travel") Travel travel, Model model) {
		List<Travel> travels = travelServe.all();
		model.addAttribute("travels", travels);
		return "index.jsp";
	}
	
//	@GetMapping("/expenses/new")
//	public String newTravel(@ModelAttribute("travel") Travel travel) {
//		return "/expenses/new/jsp";
//	}
	
	@GetMapping("/expenses/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
//		model.addAttribute("travel", travelServe.find(id));
		Travel travel = travelServe.find(id);
		model.addAttribute("travel", travel);
		return "show.jsp";
	}
	
	@PostMapping("/expenses")
	public String create(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Travel> travels = travelServe.all();
			model.addAttribute("travels", travels);
			return "index.jsp";
		} else {
			travelServe.create(travel);
			return "redirect:/";
		}
	}
	@GetMapping("/expenses/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Travel travel = travelServe.find(id);
		model.addAttribute("travel", travel);
		return "edit.jsp";
	}
	@PutMapping("/expenses/{id}")
	public String update(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, @PathVariable("id") Long id, Model model) {
		if (result.hasErrors()) {
			return "/expenses/edit.jsp";
		} else {
			travel.setId(id);
			travelServe.update(travel);
			return "redirect:/";
		}
	}

	@DeleteMapping("/expenses/destroy/{id}")
	public String destroy(@PathVariable("id") Long id) {
		travelServe.delete(id);
		return "redirect:/";
	}
}
