package com.medium.instance.services;

import com.medium.instance.models.DTO.user.WebUserDTO;
import com.medium.instance.models.entity.user.WebUserEntity;
import com.medium.instance.repositories.WebUserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebUserService implements WebUserServiceInterface {

    @Autowired
    WebUserRepository userRepo;

    @Override
    public WebUserDTO createWebUser(WebUserDTO webuserDTO) {
        ModelMapper entityMapper = new ModelMapper();
        WebUserEntity webUserEntity = entityMapper.map(webuserDTO, WebUserEntity.class);
        WebUserEntity createdUser = userRepo.save(webUserEntity);
        ModelMapper dtoMapper = new ModelMapper();
        return dtoMapper.map(createdUser, WebUserDTO.class);
    }

}
