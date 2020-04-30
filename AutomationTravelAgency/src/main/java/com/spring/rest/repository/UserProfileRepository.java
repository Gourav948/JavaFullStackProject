
package com.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.spring.entity.UserProfileEntity;
 
@Component
public interface UserProfileRepository extends JpaRepository<UserProfileEntity, Long>  {

}

