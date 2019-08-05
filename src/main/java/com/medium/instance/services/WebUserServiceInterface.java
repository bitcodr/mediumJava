package com.medium.instance.services;

import com.medium.instance.models.user.WebUser;

import java.util.UUID;

public interface WebUserServiceInterface {

     UUID createWebUser(WebUser webUser);
}
