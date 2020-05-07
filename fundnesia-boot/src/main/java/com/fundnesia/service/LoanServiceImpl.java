package com.fundnesia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundnesia.dao.LoanDao;
import com.fundnesia.entity.Loan;

@Service
public class LoanServiceImpl implements LoanService {

	@Autowired
	private LoanDao loanDao;
	
	@Override
	public List<Loan> findAll() {
		return loanDao.findAll();
	}

	@Override
	public void save(Loan loan) {
		loanDao.save(loan);
	}

	@Override
	public Loan findById(int loanId) {
		return loanDao.findById(loanId);
	}

	@Override
	public void deleteById(int loanId) {
		loanDao.deleteById(loanId);
	}

}
