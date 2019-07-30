package com.techprimers.security.springsecurityauthserver.service;

import com.techprimers.security.springsecurityauthserver.model.AccountDetails;

/**
 * @author Karthick Rajendran
 *
 */
public interface AccountService {

public AccountDetails loadAccountByUsername(String name);
}