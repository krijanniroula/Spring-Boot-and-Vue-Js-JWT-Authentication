package com.npksahakari.system.models;

import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import java.sql.Date;

//@Entity
//@Table(name = "kharcha")
//@EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties(allowGetters = true)
public class Kharcha extends BaseEntity {

	@NotNull
	private Date date;
	@Nullable
	private String particular;
	@NotNull
	private Double amount;

	public Kharcha() {
		super();
	}

	public Kharcha( @NotNull Date date, String particular,  @NotNull double amount) {
		super();
		this.date = date;
		this.particular = particular;
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getParticular() {
		return particular;
	}

	public void setParticular(String particular) {
		this.particular = particular;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}


}
