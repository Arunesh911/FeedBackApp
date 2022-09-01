
package com.arshtech.service;

import java.util.Optional;

import org.eclipse.jdt.internal.compiler.env.IModule.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arshtech.entity.Feedback;
import com.arshtech.entity.UserDetails;
import com.arshtech.repo.IFeedbacUserRepo;
import com.arshtech.repo.IFeedbackRepo;

@Service
public class FeedbackService implements IFeedbackService {

	@Autowired
	private IFeedbackRepo feedbackRepo;

	@Autowired
	private IFeedbacUserRepo feedbacUserRepo;

	private Feedback save;

	@Override
	public boolean availabeUserCheck(String mobNum) {

		boolean status = false;
		Optional<UserDetails> findById = feedbacUserRepo.findById(mobNum);
		if (findById.isPresent()) {
			status = true;
		}
		return status;
	}

	@Override 
	public boolean saveUserFeedback(Feedback feedback) { 
		Feedback saved = feedbackRepo.save(feedback);
		return saved.getMobileNo()!=null;
		}

}
