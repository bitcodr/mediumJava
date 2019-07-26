package com.medium.instance.repositories;

import com.medium.instance.models.user.WebUser;
import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface WebUserRepository extends JpaRepository<WebUser, String> {


}
