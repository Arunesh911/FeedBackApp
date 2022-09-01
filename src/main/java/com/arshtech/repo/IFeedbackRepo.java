
package com.arshtech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arshtech.entity.Feedback;

@Repository
public interface IFeedbackRepo extends JpaRepository<Feedback, Integer> {

}
