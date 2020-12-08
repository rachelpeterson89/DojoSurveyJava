package com.rpete.dojosurvey2;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurveyController {
	
	@RequestMapping("")
	public String index(HttpSession session) {
		Integer count = (Integer)session.getAttribute("count");
		System.out.println(count);
		try {
			if(count.equals(null)) {
				System.out.println(session.getAttribute("count"));
			}
		} catch(NullPointerException error) {
			session.setAttribute("count", 0);
		}
		return "index.jsp";
	}
	
	@RequestMapping(value="/submitSurvey", method=RequestMethod.POST)
	public String submitSurvey(
			HttpSession session,
			@RequestParam(value="name") String name,
			@RequestParam(value="location") String location,
			@RequestParam(value="language") String language,
			@RequestParam(value="comment") String comment
			) {
		// set session with form data
		session.setAttribute("nameInput", name);
		session.setAttribute("locationInput", location);
		session.setAttribute("languageInput", language);
		session.setAttribute("commentInput", comment);
		// get count from session
		Integer count = (Integer) session.getAttribute("count");
		// add to count variable
		count += 1;
		// set count back in session
		session.setAttribute("count", count);
		if (session.getAttribute("languageInput").equals("Java")) {
			return "redirect:/java";
		} else {
			return "redirect:/result";
		}
	}
	
	@RequestMapping("/result")
	public String result(HttpSession session, Model model) {
		// get session
		String displayName = (String) session.getAttribute("nameInput");
		String displayLocation = (String) session.getAttribute("locationInput");
		String displayLanguage = (String) session.getAttribute("languageInput");
		String displayComment = (String) session.getAttribute("commentInput");
		// get count from session
		Integer count = (Integer) session.getAttribute("count");
		// add session data to model attribute
		model.addAttribute("name", displayName);
		model.addAttribute("location", displayLocation);
		model.addAttribute("language", displayLanguage);
		model.addAttribute("comment", displayComment);
		// add count to model
		model.addAttribute("counter", count);
//		System.out.println("name in result " + displayName);
		return "result.jsp";
	}
	
	@RequestMapping("/java")
	public String java(HttpSession session, Model model) {
		// get session
		String displayName = (String) session.getAttribute("nameInput");
		String displayLocation = (String) session.getAttribute("locationInput");
		String displayLanguage = (String) session.getAttribute("languageInput");
		String displayComment = (String) session.getAttribute("commentInput");
		// get count from session
		Integer count = (Integer) session.getAttribute("count");
		// add session data to model attribute
		model.addAttribute("name", displayName);
		model.addAttribute("location", displayLocation);
		model.addAttribute("language", displayLanguage);
		model.addAttribute("comment", displayComment);
		// add count to model
		model.addAttribute("counter", count);
		return "javaResult.jsp";
	}
}
