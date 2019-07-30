package com.techprimers.security.springsecurityauthserver.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techprimers.security.springsecurityauthserver.model.AccountDetails;
import com.techprimers.security.springsecurityauthserver.model.Users;

/**
 * @author Karthick Rajendran
 *
 */

@Repository
public interface AccountRepository extends JpaRepository<AccountDetails,Integer>{
	 Optional<AccountDetails> findByName(String name);

}
