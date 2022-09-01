
package com.arshtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.arshtech.entity.Feedback;
import com.arshtech.service.IFeedbackService;
import com.arshtech.validator.Validator;

@Controller
public class FeedbacController {

	@Autowired
	private IFeedbackService feedbackService;
	
	@Autowired
	private Validator validator;

	@GetMapping("/entermobile")
	public String enterMobile() {

		return "entermobile";
	}
	
	
	@GetMapping("/usermobile")
	public String checkUserAvailaiblity(@RequestParam String userMob) {
		if(validator.validateMob(userMob)) {
		String respMsg = "usernotavailabe";
		boolean isAvailabe = feedbackService.availabeUserCheck(userMob);
		if (isAvailabe) {
			respMsg = "rating";
		}

		return respMsg;
		}else {
			return "entermobile2"; 
		}
	}
	
	@GetMapping("/feedbackform")
	public String displayFeedbackFrorm() {
		return "feedbackform";
	}
	@GetMapping("/feedbackform2")
	public String displayFeedbackFrorm2() {
		return "feedbackform2";
	}
	
	
	@PostMapping("/savefeedback")
	public String  feedbackBackFormSubmit(@ModelAttribute("feedback") Feedback feedback) {
		
		String respMsp="You feedback form not saved ";
		boolean feedbkSaved= feedbackService.saveUserFeedback(feedback);
		if(feedbkSaved) {
			respMsp= "";
		}
		return respMsp;
	}
}
