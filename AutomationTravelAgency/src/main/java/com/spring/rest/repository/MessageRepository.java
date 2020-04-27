package com.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.spring.entity.CustomerEntity;
 

@Component
public interface MessageRepository extends JpaRepository<CustomerEntity, Long> {

}
