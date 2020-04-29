package com.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.CreditCardEntity;

public interface CreditCardRepository extends JpaRepository<CreditCardEntity, Long> {

}
