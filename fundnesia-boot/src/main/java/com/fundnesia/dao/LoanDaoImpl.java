package com.fundnesia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fundnesia.entity.Loan;

@Repository
public class LoanDaoImpl implements LoanDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Loan> findAll() {
		TypedQuery<Loan> query =entityManager.createQuery("from Loan", Loan.class);
		return query.getResultList();
	}

	@Override
	public Loan findById(int loanId) {
		return entityManager.find(Loan.class, loanId);
	}

	@Override
	public void save(Loan loan) {
		entityManager.persist(loan);
	}

	@Override
	public void deleteById(int loanId) {
		Query query =entityManager.createQuery("delete from Loan where id=:loanId");
		query.setParameter("loanId", loanId);
		query.executeUpdate();
	}

}
