
package com.arshtech.service;

import com.arshtech.entity.Feedback;

public interface IFeedbackService {

	public boolean availabeUserCheck(String userMob);

	public boolean saveUserFeedback(Feedback feedback);

}
