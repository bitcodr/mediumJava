package com.medium.instance.services.user;


import com.medium.instance.models.DTO.user.WebUserDTO;
import com.medium.instance.models.Status;
import com.medium.instance.models.entity.user.WebUserEntity;
import com.medium.instance.repositories.WebUserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Service
public class WebUserService implements WebUserServiceInterface {

    @Autowired
    WebUserRepository userRepo;

    @Autowired
    BCryptPasswordEncoder encoder;

    @Override
    @Transactional
    public WebUserDTO createWebUser(WebUserDTO webuserDTO) {
        ModelMapper entityMapper = new ModelMapper();
        WebUserEntity webUserEntity = entityMapper.map(webuserDTO, WebUserEntity.class);
        webUserEntity.setPassword(encoder.encode(webuserDTO.getPassword()));
        webUserEntity.setEmailVerificationToken(encoder.encode(webuserDTO.getUserName()));
        webUserEntity.setCreatedAt(new Date());
        webUserEntity.setCreatedBy(UUID.randomUUID());
        webUserEntity.setStatus(Status.ACTIVATE);
        WebUserEntity createdUser = userRepo.save(webUserEntity);
        ModelMapper dtoMapper = new ModelMapper();
        return dtoMapper.map(createdUser, WebUserDTO.class);
    }

    @Override
    public WebUserDTO getUser(String email) {
        WebUserEntity webUserEntity =  userRepo.findByEmail(email);
        if(webUserEntity == null) throw new UsernameNotFoundException(email);
        ModelMapper mapper = new ModelMapper();
        return mapper.map(webUserEntity,WebUserDTO.class);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        WebUserEntity webUserEntity =  userRepo.findByEmail(email);
        if(webUserEntity == null) throw new UsernameNotFoundException(email);
        return new User(webUserEntity.getEmail(), webUserEntity.getPassword(), new ArrayList<>());
    }

}