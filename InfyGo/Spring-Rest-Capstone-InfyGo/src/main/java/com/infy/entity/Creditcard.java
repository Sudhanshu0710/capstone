package com.infy.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "creditcard_details")
public class Creditcard {
	@Id
	private String cardNumber;
	private String apin;
	private String cardHolderName;
	private String cvv;
	private String expiryMonth;
	private String expiryYear;
	private String totalBill;
	
	public Creditcard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Creditcard(String cardNumber, String apin, String cardHolderName, String cvv, String expiryMonth,
			String expiryYear, String totalBill) {
		super();
		this.cardNumber = cardNumber;
		this.apin = apin;
		this.cardHolderName = cardHolderName;
		this.cvv = cvv;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.totalBill = totalBill;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getApin() {
		return apin;
	}

	public void setApin(String apin) {
		this.apin = apin;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public String getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}

	public String getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(String totalBill) {
		this.totalBill = totalBill;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cardNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Creditcard other = (Creditcard) obj;
		return Objects.equals(cardNumber, other.cardNumber);
	}

	@Override
	public String toString() {
		return "Creditcard [cardNumber=" + cardNumber + ", apin=" + apin + ", cardHolderName=" + cardHolderName
				+ ", cvv=" + cvv + ", expiryMonth=" + expiryMonth + ", expiryYear=" + expiryYear + ", totalBill="
				+ totalBill + "]";
	}
	
	
}
