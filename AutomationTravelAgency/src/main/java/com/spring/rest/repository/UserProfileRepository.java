
package com.spring.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.spring.entity.DriverEntity;
import com.spring.entity.UserProfileEntity;

 
@Component
public interface UserProfileRepository extends JpaRepository<UserProfileEntity, Long>  
{

	UserProfileEntity findByPassword(String oldPassword);

	List<UserProfileEntity> findBySessionId(String authtoken);

	UserProfileEntity findByUserId(long userId);

	UserProfileEntity findByEmailId(String emailId);

}

