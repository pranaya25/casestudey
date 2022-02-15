package com.example.Users;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepo extends MongoRepository <UserInfo,String> {
		//public void updateUserInfo(String name,String brand);

}
