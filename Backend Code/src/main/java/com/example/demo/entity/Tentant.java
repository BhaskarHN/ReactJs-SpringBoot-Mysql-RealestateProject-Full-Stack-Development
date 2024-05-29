package com.example.demo.entity;

import java.sql.Date;
import java.util.Arrays;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="Tentant_Management")
public class Tentant {

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@Lob
	@Column(name = "Tenatant_picture",length = 50000000)
	private byte[] Tenatant_picture;
	private String Contact;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date LeaseStart_date;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date LeaseEnd_date;
	private String Security_Deposit;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date PaymentDate;
	private String Amount;
	private String PaymentStatus;
	@Lob
	@Column(name = "Uploadlease_agreement",length = 50000000)
	private byte[] Uploadlease_agreement;
	public Tentant() {
		
	}
	public Tentant(long id, byte[] tenatant_picture, String contact, Date leaseStart_date, Date leaseEnd_date,
			String security_Deposit, Date paymentDate, String amount, String paymentStatus,
			byte[] uploadlease_agreement) {
		super();
		Id = id;
		Tenatant_picture = tenatant_picture;
		Contact = contact;
		LeaseStart_date = leaseStart_date;
		LeaseEnd_date = leaseEnd_date;
		Security_Deposit = security_Deposit;
		PaymentDate = paymentDate;
		Amount = amount;
		PaymentStatus = paymentStatus;
		Uploadlease_agreement = uploadlease_agreement;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public byte[] getTenatant_picture() {
		return Tenatant_picture;
	}
	public void setTenatant_picture(byte[] tenatant_picture) {
		Tenatant_picture = tenatant_picture;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public Date getLeaseStart_date() {
		return LeaseStart_date;
	}
	public void setLeaseStart_date(Date leaseStart_date) {
		LeaseStart_date = leaseStart_date;
	}
	public Date getLeaseEnd_date() {
		return LeaseEnd_date;
	}
	public void setLeaseEnd_date(Date leaseEnd_date) {
		LeaseEnd_date = leaseEnd_date;
	}
	public String getSecurity_Deposit() {
		return Security_Deposit;
	}
	public void setSecurity_Deposit(String security_Deposit) {
		Security_Deposit = security_Deposit;
	}
	public Date getPaymentDate() {
		return PaymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		PaymentDate = paymentDate;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getPaymentStatus() {
		return PaymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		PaymentStatus = paymentStatus;
	}
	public byte[] getUploadlease_agreement() {
		return Uploadlease_agreement;
	}
	public void setUploadlease_agreement(byte[] uploadlease_agreement) {
		Uploadlease_agreement = uploadlease_agreement;
	}
	@Override
	public String toString() {
		return "Tentant [Id=" + Id + ", Tenatant_picture=" + Arrays.toString(Tenatant_picture) + ", Contact=" + Contact
				+ ", LeaseStart_date=" + LeaseStart_date + ", LeaseEnd_date=" + LeaseEnd_date + ", Security_Deposit="
				+ Security_Deposit + ", PaymentDate=" + PaymentDate + ", Amount=" + Amount + ", PaymentStatus="
				+ PaymentStatus + ", Uploadlease_agreement=" + Arrays.toString(Uploadlease_agreement) + "]";
	}
	public void setTenantPictureUrl(String tenantPictureUrl) {
		// TODO Auto-generated method stub
		
	}
	public void settenantName(String tenantName) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
