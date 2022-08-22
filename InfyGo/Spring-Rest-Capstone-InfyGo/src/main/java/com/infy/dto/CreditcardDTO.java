package com.infy.dto;

import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

public class CreditcardDTO {
	
	@NotNull(message = "{creditcard.cardnumber.null}")
	@NotBlank(message = "{creditcard.cardnumber.blank}")
	@Pattern(regexp = "^(?=.*[0-9a-zA-Z]).{16}$", message = "{creditcard.cardnumber.invalid}")
	private String cardNumber;
	@NotNull(message = "{creditcard.apin.null}")
	@NotBlank(message = "{creditcard.apin.blank}")
	private String apin;
	@NotNull(message = "{creditcard.cardholdername.null}")
	@NotBlank(message = "{creditcard.cardholdername.blank}")
	private String cardHolderName;
	@NotNull(message = "{creditcard.cvv.null}")
	@NotBlank(message = "{creditcard.cvv.blank}")
	@Pattern(regexp = "^[0-9]{3}$", message = "{creditcard.cvv.invalid}")
	private String cvv;
	@NotNull(message = "{creditcard.expirymonth.null}")
	@NotBlank(message = "{creditcard.expirymonth.blank}")
	@DateTimeFormat(pattern = "MMM")
//	@Future(message = "{creditcard.expirymonth.invalid}")
	private String expiryMonth;
	@NotNull(message = "{creditcard.expiryyear.null}")
	@NotBlank(message = "{creditcard.expiryyear.blank}")
	@DateTimeFormat(pattern = "yyyy")
//	@FutureOrPresent(message = "{creditcard.expiryyear.invalid}")
	private String expiryYear;
	private String totalBill;
	
	public CreditcardDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditcardDTO(
			@NotNull(message = "{creditcard.cardnumber.null}") @NotBlank(message = "{creditcard.cardnumber.blank}") @Pattern(regexp = "^(?=.*[0-9a-zA-Z]).{16}$", message = "{creditcard.cardnumber.invalid}") String cardNumber,
			@NotNull(message = "{creditcard.apin.null}") @NotBlank(message = "{creditcard.apin.blank}") String apin,
			@NotNull(message = "{creditcard.cardholdername.null}") @NotBlank(message = "{creditcard.cardholdername.blank}") String cardHolderName,
			@NotNull(message = "{creditcard.cvv.null}") @NotBlank(message = "{creditcard.cvv.blank}") @Pattern(regexp = "^[0-9]{3}$", message = "{creditcard.cvv.invalid}") String cvv,
			@NotNull(message = "{creditcard.expirymonth.null}") @NotBlank(message = "{creditcard.expirymonth.blank}") String expiryMonth,
			@NotNull(message = "{creditcard.expiryyear.null}") @NotBlank(message = "{creditcard.expiryyear.blank}") String expiryYear,
			String totalBill) {
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
		CreditcardDTO other = (CreditcardDTO) obj;
		return Objects.equals(cardNumber, other.cardNumber);
	}

	@Override
	public String toString() {
		return "CreditcardDTO [cardNumber=" + cardNumber + ", apin=" + apin + ", cardHolderName=" + cardHolderName
				+ ", cvv=" + cvv + ", expiryMonth=" + expiryMonth + ", expiryYear=" + expiryYear + ", totalBill="
				+ totalBill + "]";
	}
	
}
