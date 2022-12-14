package com.zohocrm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.Billing;
import com.zohocrm.services.BillingService;

@Controller
public class billingController {
	
	@Autowired
	private BillingService billService;
	
	@RequestMapping("/generate")
	public String generateBill(@ModelAttribute("bill") Billing bill, ModelMap model) {
		billService.generateOneBill(bill);
		model.addAttribute("bill", bill);
		return "billing_result";
	}

}
