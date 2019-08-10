package com.medium.instance.repositories;

import com.medium.instance.models.entity.user.WebUserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Repository
public interface WebUserRepository extends CrudRepository<WebUserEntity, UUID> {

    WebUserEntity findByEmail(String email);
}
