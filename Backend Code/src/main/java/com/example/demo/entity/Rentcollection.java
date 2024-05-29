package com.example.demo.entity;

import java.sql.Date;
import java.time.LocalTime;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="RentCollection")
public class Rentcollection {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 private String Property_Type;
	private String Location;
	private String Floor;
	private  int RentAmount;
	private Date PayAmount_Date;
	private LocalTime Time;
	private String PaymentType;
	@Lob
	@Column(name = "Relavent_paymentDetail",length = 50000000)
	private byte[] Relavent_paymentDetail;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProperty_Type() {
		return Property_Type;
	}
	public void setProperty_Type(String property_Type) {
		Property_Type = property_Type;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getFloor() {
		return Floor;
	}
	public void setFloor(String floor) {
		Floor = floor;
	}
	public int getRentAmount() {
		return RentAmount;
	}
	public void setRentAmount(int rentAmount) {
		RentAmount = rentAmount;
	}
	public Date getPayAmount_Date() {
		return PayAmount_Date;
	}
	public void setPayAmount_Date(Date payAmount_Date) {
		PayAmount_Date = payAmount_Date;
	}
	public LocalTime getTime() {
		return Time;
	}
	public void setTime(LocalTime time) {
		Time = time;
	}
	public String getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}
	public byte[] getRelavent_paymentDetail() {
		return Relavent_paymentDetail;
	}
	public void setRelavent_paymentDetail(byte[] relavent_paymentDetail) {
		Relavent_paymentDetail = relavent_paymentDetail;
	}
	public Rentcollection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rentcollection(Long id, String property_Type, String location, String floor, int rentAmount,
			Date payAmount_Date, LocalTime time, String paymentType, byte[] relavent_paymentDetail) {
		super();
		this.id = id;
		Property_Type = property_Type;
		Location = location;
		Floor = floor;
		RentAmount = rentAmount;
		PayAmount_Date = payAmount_Date;
		Time = time;
		PaymentType = paymentType;
		Relavent_paymentDetail = relavent_paymentDetail;
	}
	@Override
	public String toString() {
		return "Rentcollection [id=" + id + ", Property_Type=" + Property_Type + ", Location=" + Location + ", Floor="
				+ Floor + ", RentAmount=" + RentAmount + ", PayAmount_Date=" + PayAmount_Date + ", Time=" + Time
				+ ", PaymentType=" + PaymentType + ", Relavent_paymentDetail=" + Arrays.toString(Relavent_paymentDetail)
				+ "]";
	}
	

}
