package com.medium.instance.services;

import com.medium.instance.models.DTO.user.WebUserDTO;
import com.medium.instance.models.response.user.WebUserResponse;

public interface WebUserServiceInterface {

     WebUserResponse createWebUser(WebUserDTO webUser);
}
