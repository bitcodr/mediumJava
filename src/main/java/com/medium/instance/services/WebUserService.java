package com.medium.instance.services;

import com.medium.instance.models.user.WebUser;
import com.medium.instance.repositories.WebUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class WebUserService implements WebUserServiceInterface {

    @Autowired
    WebUserRepository userRepo;

    @Override
    public UUID createWebUser(WebUser webuser) {
        userRepo.save(webuser);
        return webuser.getId();
    }
}
