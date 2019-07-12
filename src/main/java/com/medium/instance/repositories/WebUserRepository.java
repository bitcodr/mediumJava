package com.medium.instance.repositories;

import com.medium.instance.models.user.WebUser;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface WebUserRepository extends CrudRepository<WebUser, String> {


}
