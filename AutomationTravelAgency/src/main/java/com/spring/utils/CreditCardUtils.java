package com.spring.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.spring.entity.CreditCardEntity;
import com.spring.json.CreditCard;
 

public class CreditCardUtils 
{
	public static List<CreditCard> convertCreditCardEntityListToCreditCardList(List<CreditCardEntity> creditCardEntityList) {
		List<CreditCard> creditCardList = new ArrayList<CreditCard>();
		Consumer<CreditCardEntity> consumer = (CreditCardEntity creditCardEntity)->creditCardList.add(convertCreditCardEntityToCreditCard(creditCardEntity));
		creditCardEntityList.stream().forEach(consumer);
		return creditCardList;
	}
	
	public static CreditCard convertCreditCardEntityToCreditCard(CreditCardEntity creditCardEntity) {
		return new CreditCard(creditCardEntity.getCreditCardNumber(), creditCardEntity.getValidFrom(),creditCardEntity.getValidTo(),creditCardEntity.getCreditBalance(),
				UserCredentialsUtils.convertUserCredentialsEntityToUserCredentials(creditCardEntity.getUserCredentialsEntity()));
	}

	public static CreditCardEntity convertCreditCardToCreditCardEntity(CreditCard creditCard) {
		return new CreditCardEntity( creditCard.getValidFrom(),creditCard.getValidTo(),creditCard.getCreditBalance(),
			UserCredentialsUtils.convertUserCredentialsToUserCredentialsEntity(creditCard.getUserCredentials()));
		}
}
