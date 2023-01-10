package com.sha.dernek.service;

import com.sha.dernek.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
