package com.spring.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

 
import com.spring.json.UserCredentials;


 

@Component
public interface UserCredentialsRepository extends JpaRepository<UserCredentials, Long> 
{
	List<UserCredentials> findById(long userId);
	List<UserCredentials> findBySessionId(String sessionId);
}
