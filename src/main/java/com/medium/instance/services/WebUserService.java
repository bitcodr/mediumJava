package com.medium.instance.services;

import com.medium.instance.models.DTO.user.WebUserDTO;
import com.medium.instance.models.entity.user.WebUserEntity;
import com.medium.instance.models.response.user.WebUserResponse;
import com.medium.instance.repositories.WebUserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebUserService implements WebUserServiceInterface {

    @Autowired
    WebUserRepository userRepo;

    @Override
    public WebUserResponse createWebUser(WebUserDTO webuserDTO) {
        ModelMapper mapper = new ModelMapper();
        WebUserEntity webUserEntity = mapper.map(webuserDTO,WebUserEntity.class);
        userRepo.save(webUserEntity);
        return webuser.getId();
    }
}
