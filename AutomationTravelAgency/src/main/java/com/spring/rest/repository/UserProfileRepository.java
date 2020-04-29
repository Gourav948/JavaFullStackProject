package com.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.UserCredentialsEntity;
import com.spring.entity.UserProfileEntity;

public interface UserProfileRepository extends JpaRepository<UserProfileEntity, Long>  {

}
