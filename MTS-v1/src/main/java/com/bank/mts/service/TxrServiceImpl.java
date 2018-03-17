package com.bank.mts.service;

import org.apache.log4j.Logger;

import com.bank.mts.model.Account;
import com.bank.mts.repository.AccountRepository;

public class TxrServiceImpl implements TxrService {

	private Logger logger = Logger.getLogger("mts");

	public TxrServiceImpl() {
		logger.info("Txr Service instantiated");
	}

	private AccountRepository accountRepository;

	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		logger.info("AccountRepository injected to TxrService");
	}

	public boolean txr(double amount, String fromAccNum, String toAccNum) {

		logger.info("New Transfer begin");
		// load from & to accounts
		Account fromAcc = accountRepository.loadAccount(fromAccNum);
		Account toAcc = accountRepository.loadAccount(toAccNum);

		// debit & credit

		fromAcc.setBalance(fromAcc.getBalance()-amount);
		toAcc.setBalance(toAcc.getBalance()+amount);

		// update both accounts
		accountRepository.updateAccount(fromAcc);
		accountRepository.updateAccount(toAcc);
		logger.info("Txr Success");
		return true;
	}

}
