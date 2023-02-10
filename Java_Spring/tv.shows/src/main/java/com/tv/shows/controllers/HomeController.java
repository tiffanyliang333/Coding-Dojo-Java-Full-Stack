package com.tv.shows.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tv.shows.models.LoginUser;
import com.tv.shows.models.Show;
import com.tv.shows.models.User;
import com.tv.shows.services.ShowService;
import com.tv.shows.services.UserService;

@Controller
public class HomeController {
	@Autowired 
	private UserService userServ;
	
	@Autowired
	private ShowService showServ;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "index.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model, HttpSession session) {
		User user = userServ.register(newUser, result);
		if (result.hasErrors()) {
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		}
		session.setAttribute("userId", user.getId());
		return "redirect:/shows";
	}
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model, HttpSession session) {
		User logUser = userServ.login(newLogin, result);
		if (result.hasErrors() || logUser==null) {
			model.addAttribute("newUser", new User());
			return "index.jsp";
		}
		session.setAttribute("userId", logUser.getId());
		return "redirect:/shows";
	}
	
	@GetMapping("/shows")
	public String home(HttpSession session, Model model) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		
		Long userId = (Long)session.getAttribute("userId");
		List<Show> shows = showServ.all();
		model.addAttribute("shows", shows);
		model.addAttribute("user", userServ.findById(userId));
		return "home.jsp";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("userId");
		return "redirect:/";
	}
	
	@GetMapping("/shows/new")
	public String newShow(@ModelAttribute("newShow") Show newShow, Model model, HttpSession session) {
		User user = userServ.findById((Long)session.getAttribute("userId"));
		model.addAttribute("user", user);
		return "new.jsp";
	}
	
	@PostMapping("/addShow")
	public String addShow(@Valid @ModelAttribute("newShow") Show newShow, BindingResult result, HttpSession session) {
		if (result.hasErrors()) {
			return "new.jsp";
		}
		Long userId = (Long)session.getAttribute("userId");
		User loggedUser = userServ.findById(userId);
		newShow.setUser(loggedUser);
		newShow = showServ.upload(newShow);
		return "redirect:/shows";
	}
	
	@GetMapping("/shows/{id}")
	public String showShow(@PathVariable("id") Long id, Model model, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
//		Long userId = (Long)session.getAttribute(userId);
		Show show = showServ.findById(id);
		model.addAttribute("show", show);
		model.addAttribute("user", userServ.findById((Long)session.getAttribute("userId")));
		return "show.jsp";
	}
	
//	@GetMapping("/books/edit/{id}")
//	public String edit(@PathVariable("id") Long id, Model model, HttpSession session) {
//		User user = userServ.findById((Long)session.getAttribute("userId"));
//		model.addAttribute("user", user);
//		model.addAttribute("book", bookServ.findById(id));
//		return "edit.jsp";
//		
//	}
	
	@GetMapping("/shows/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model, HttpSession session) {
		User user = userServ.findById((Long)session.getAttribute("userId"));
		Show updateShow = showServ.findById(id);
		model.addAttribute("user", user);
		model.addAttribute("show", updateShow);
		return "edit.jsp";
	}
	
	@PostMapping("/updateShow/{id}")
	public String update(@Valid @ModelAttribute("show") Show show, BindingResult result, @PathVariable("id") Long id, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("show", showServ.findById(id));
			return "edit.jsp";
		} else {
			show.setId(id);
			showServ.update(show);
			return "redirect:/shows";
		}
	}
	
//	@DeleteMapping("/books/delete/{id}")
//	public String destroy(@PathVariable("id") Long id) {
//		bookServ.deleteBook(id);
//		return "redirect:/books";
//	}
	
	@RequestMapping("/shows/delete/{id}")
	public String destroy(@PathVariable("id") Long id) {
		Show book = showServ.findById(id);
		showServ.deleteBook(book);
		return "redirect:/shows";
	}
}
