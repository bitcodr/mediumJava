package com.medium.instance.services.user;


import com.medium.instance.models.DTO.user.WebUserDTO;
import com.medium.instance.models.entity.user.WebUserEntity;
import com.medium.instance.repositories.WebUserRepository;
import com.medium.instance.services.WebUserServiceInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class WebUserService implements WebUserServiceInterface {

    @Autowired
    WebUserRepository userRepo;

    @Autowired
    BCryptPasswordEncoder encoder;

    @Override
    public WebUserDTO createWebUser(WebUserDTO webuserDTO) {
        ModelMapper entityMapper = new ModelMapper();
        WebUserEntity webUserEntity = entityMapper.map(webuserDTO, WebUserEntity.class);
        webUserEntity.setPassword(encoder.encode(webuserDTO.getPassword()));
        WebUserEntity createdUser = userRepo.save(webUserEntity);
        ModelMapper dtoMapper = new ModelMapper();
        return dtoMapper.map(createdUser, WebUserDTO.class);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }

}
