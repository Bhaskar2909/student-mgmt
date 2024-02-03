package com.Bhaskar.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Bhaskar.Service.DashboardService;

@Controller
public class DashboardController {
	
	@Autowired
	private DashboardService dasbboardService;
	
	@GetMapping("/dashboard")
	public String buildDashboard(Model model) {
		String quoteTxt=dasbboardService.getQuote();
		model.addAttribute("quote", quoteTxt);
		return "dashboard";
	}
	 public String getNewQuote( ) {
		return null;
	}

}
