
package com.arshtech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arshtech.entity.UserDetails;

@Repository
public interface IFeedbacUserRepo extends JpaRepository<UserDetails, String> {

}
