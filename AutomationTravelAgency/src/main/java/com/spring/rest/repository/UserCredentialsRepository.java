package com.spring.rest.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.spring.entity.UserCredentialsEntity;
import com.spring.json.UserCredentials;
 

@Component
public interface UserCredentialsRepository extends JpaRepository<UserCredentialsEntity, Long> 
{
 

}
