package com.arshtech.validator;

import org.springframework.stereotype.Component;

@Component
public class Validator {

	public boolean validateMob(String mob) {
		boolean valRespone=false;
		if(mob.length()==10) {
			try {
				Integer.parseInt(mob);
				
			}catch (Exception e) {
				
			}
			valRespone=true;
		}
		
		return valRespone;
		
	}
}
