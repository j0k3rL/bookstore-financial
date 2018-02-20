package com.bookstore.financial.core.entity;

import java.math.BigDecimal;
import java.util.Arrays;

import javax.persistence.Entity;

import com.bookstore.libraries.jpa.AbstractEntity;

@Entity
public class Invoice extends AbstractEntity {

	private static final long serialVersionUID = -6856124368017177689L;

	private BigDecimal number;
	
	private byte[] file;

	/**
	 * @return the number
	 */
	public BigDecimal getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(BigDecimal number) {
		this.number = number;
	}

	/**
	 * @return the file
	 */
	public byte[] getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(byte[] file) {
		this.file = file;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Invoice [number=" + number + ", file=" + Arrays.toString(file) + "]";
	}
}