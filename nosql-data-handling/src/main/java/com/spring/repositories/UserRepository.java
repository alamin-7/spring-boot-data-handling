package com.spring.repositories;

import com.spring.models.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <UserInfo, Integer> {
}
