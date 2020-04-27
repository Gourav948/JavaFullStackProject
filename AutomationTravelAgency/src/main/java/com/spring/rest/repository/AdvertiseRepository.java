package com.spring.rest.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.spring.entity.AdminisitratorEntity;
 

@Component
public interface AdvertiseRepository extends JpaRepository<AdminisitratorEntity, Long> 
{
 

}
