package com.bookstore.financial.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.bookstore.libraries.jpa.AbstractEntity;

@Entity
@Table
public class Customer extends AbstractEntity {

	private static final long serialVersionUID = 8546466113547101306L;

	@Column
	private String cpf;
	
	@Column
	private String name;
	
	@Column
	private String email;

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [cpf=" + cpf + ", name=" + name + ", email=" + email + "]";
	}
}