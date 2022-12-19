package com.sallyschristmas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sallyschristmas.entity.CreditCard;
import com.sallyschristmas.repo.CreditCardRepo;

@Service
public class CreditCardService {
    
    @Autowired
    CreditCardRepo creditCardRepo;

    public CreditCard save(CreditCard card) {
        return creditCardRepo.save(card);
    }

    public CreditCard getById(Integer cardId) {
        return creditCardRepo.findById(cardId).get();
    }

    public void deleteById(Integer cardId) {
        creditCardRepo.deleteById(cardId);
    }

    public void delete(CreditCard card) {
        creditCardRepo.delete(card);
    }

    public Boolean makePurchase(Double amount, CreditCard card) {
        // Get the remaining balance on the card if the transaction were to go through first
        Double remainder = card.getBalance() - amount;

        // If the remaining balance is less than zero, return false, not a successful transaction
        if(remainder < 0) {
            return false;
        } else {
            // If the remainder is above zero, assign the remaining balance
            // save the card to update its balance in the database
            // and return true for successful transaction
            card.setBalance(remainder);
            save(card);
            return true;

        }
    }
}
