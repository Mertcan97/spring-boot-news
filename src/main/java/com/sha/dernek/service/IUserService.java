package com.sha.dernek.service;


import com.sha.dernek.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface IUserService {

    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
        //TransactionalRequired when executing an update/delete query.
    void makeAdmin(String username);
}
