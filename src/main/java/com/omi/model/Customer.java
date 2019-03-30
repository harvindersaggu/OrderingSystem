package com.omi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	 @Id
	    @Column(name = "customerId")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    Long customerId;
	    String cusFirstname;
	    String cusLastname;
	    String cusEmail;
	    String cusPhoneNo;
	    String cusCity;
	    String cusProvince;
	    String cusCountry;
		public Long getCustomerId() {
			return customerId;
		}
		public String getCusFirstname() {
			return cusFirstname;
		}
		public String getCusLastname() {
			return cusLastname;
		}
		public String getCusEmail() {
			return cusEmail;
		}
		public String getCusPhoneNo() {
			return cusPhoneNo;
		}
		public String getCusCity() {
			return cusCity;
		}
		public String getCusProvince() {
			return cusProvince;
		}
		public String getCusCountry() {
			return cusCountry;
		}
		public void setCustomerId(Long customerId) {
			this.customerId = customerId;
		}
		public void setCusFirstname(String cusFirstname) {
			this.cusFirstname = cusFirstname;
		}
		public void setCusLastname(String cusLastname) {
			this.cusLastname = cusLastname;
		}
		public void setCusEmail(String cusEmail) {
			this.cusEmail = cusEmail;
		}
		public void setCusPhoneNo(String cusPhoneNo) {
			this.cusPhoneNo = cusPhoneNo;
		}
		public void setCusCity(String cusCity) {
			this.cusCity = cusCity;
		}
		public void setCusProvince(String cusProvince) {
			this.cusProvince = cusProvince;
		}
		public void setCusCountry(String cusCountry) {
			this.cusCountry = cusCountry;
		}
		public Customer(Long customerId, String cusFirstname, String cusLastname, String cusEmail, String cusPhoneNo,
				String cusCity, String cusProvince, String cusCountry) {
			super();
			this.customerId = customerId;
			this.cusFirstname = cusFirstname;
			this.cusLastname = cusLastname;
			this.cusEmail = cusEmail;
			this.cusPhoneNo = cusPhoneNo;
			this.cusCity = cusCity;
			this.cusProvince = cusProvince;
			this.cusCountry = cusCountry;
		}


	   

}
