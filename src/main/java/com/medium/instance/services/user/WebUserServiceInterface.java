package com.medium.instance.services.user;

import com.medium.instance.models.DTO.user.WebUserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface WebUserServiceInterface extends UserDetailsService {

    WebUserDTO createWebUser(WebUserDTO webUser);

    WebUserDTO getUser(String email);
}
