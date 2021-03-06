package com.paigunna.api.service;

import com.paigunna.api.domain.Transaction;
import com.paigunna.api.repo.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Arm
 */
@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepo transactionRepo;

    @Override
    public Transaction save(Transaction transaction) {
        return transactionRepo.save(transaction);
    }
}
