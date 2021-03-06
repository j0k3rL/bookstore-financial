package com.bookstore.financial.model.dao;

import javax.persistence.Query;

import com.bookstore.financial.model.entity.Customer;
import com.bookstore.libraries.exception.DAOException;
import com.bookstore.libraries.jpa.AbstractDAO;

public class CustomerDAO extends AbstractDAO<Customer> {

	public Customer findByCPF(String cpf) throws DAOException {

		try {

			Query query = createNamedQuery(Customer.NQ_FIND_BY_CPF, Customer.class);
			query.setParameter(Customer.CPF_PROPERTY, cpf);

			return getSingleResult(query);

		} catch (RuntimeException e) {
			throw new DAOException(e);
		}
	}
}