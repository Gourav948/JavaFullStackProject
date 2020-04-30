package com.spring.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.spring.entity.UserCredentialsEntity;
import com.spring.entity.UserProfileEntity;
import com.spring.json.UserCredentials;


 

@Component
public interface UserCredentialsRepository extends JpaRepository<UserCredentialsEntity, Long> 
{

<<<<<<< HEAD
	List<UserCredentialsEntity> findById(long userId);
=======
	UserCredentialsEntity findById(long userId);
>>>>>>> branch 'master' of https://github.com/Gourav948/JavaFullStackProject.git
	List<UserCredentialsEntity> findBySessionId(String sessionId);

}
