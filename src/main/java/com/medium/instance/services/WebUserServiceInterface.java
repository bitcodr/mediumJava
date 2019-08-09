package com.medium.instance.services;

import com.medium.instance.models.DTO.user.WebUser;

import java.util.UUID;

public interface WebUserServiceInterface {

     UUID createWebUser(WebUser webUser);
}
