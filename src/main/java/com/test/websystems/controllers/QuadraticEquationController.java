package com.test.websystems.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.websystems.components.entities.QuadraticEquation;
import com.test.websystems.services.QuadraticEquationService;

/**
 * Controller for working with save and get result about quadratic equation.
 * 
 * @author yagi
 *
 */
@Controller
public class QuadraticEquationController {

	@Autowired
	private QuadraticEquationService quadraticEquationService;

	/**
	 * Save data and calculate roots of quadratic equation in DB (create new record,
	 * not update). Redirect on result/{id} - page with result for quadratic
	 * equation (variables, roots, message for user)
	 * 
	 * @param quadraticEquation
	 * @return "redirect:result/ + quadraticEquation.getId()"
	 */
	@RequestMapping(value = "saveAndCalculate", method = RequestMethod.POST)
	public String saveResult(QuadraticEquation quadraticEquation) {

		quadraticEquationService.saveResult(quadraticEquation);

		return "redirect:result/" + quadraticEquation.getId();
	}

	/**
	 * For redirect to result page. Get information about quadratic equation by id
	 * 
	 * @param id
	 * @param model
	 * @return "result" (view page)
	 */
	@RequestMapping(value = "/result/{id}")
	public String getResult(@PathVariable Integer id, Model model) {

		model.addAttribute("result", quadraticEquationService.getResult(id));

		return "result";
	}

	/**
	 * For redirect in url to main page (index, home)
	 * 
	 * @return "index" (view page)
	 */
	@RequestMapping(value = { "/home", "", "/" })
	public String index() {
		return "index";
	}

}