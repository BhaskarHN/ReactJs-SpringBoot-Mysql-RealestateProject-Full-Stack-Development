package com.example.demo.entity;

import java.sql.Date;
import java.time.LocalTime;
import java.util.Arrays;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="PropertyPurchase_Management")
public class PropertyPurcahse {

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String Buyer_Name;
	private String Buyer_Contact;
	private String Property_type;
	private String Property_size;
	private String Property_Address;
	private String Purcahse_Price;
	private String Down_Payment;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date Purchase_Date;
	private LocalTime Time;
	@Lob
	@Column(name = "Purchase_agrement",length = 50000000)
	private byte[] Purchase_agrement;
	private String Loan_option;
	private String Share_Notes;
	public PropertyPurcahse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PropertyPurcahse(long id, String buyer_Name, String buyer_Contact, String property_type,
			String property_size, String property_Address, String purcahse_Price, String down_Payment,
			Date purchase_Date, LocalTime time, byte[] purchase_agrement, String loan_option, String share_Notes) {
		super();
		Id = id;
		Buyer_Name = buyer_Name;
		Buyer_Contact = buyer_Contact;
		Property_type = property_type;
		Property_size = property_size;
		Property_Address = property_Address;
		Purcahse_Price = purcahse_Price;
		Down_Payment = down_Payment;
		Purchase_Date = purchase_Date;
		Time = time;
		Purchase_agrement = purchase_agrement;
		Loan_option = loan_option;
		Share_Notes = share_Notes;
	}
	@Override
	public String toString() {
		return "PropertyPurcahse [Id=" + Id + ", Buyer_Name=" + Buyer_Name + ", Buyer_Contact=" + Buyer_Contact
				+ ", Property_type=" + Property_type + ", Property_size=" + Property_size + ", Property_Address="
				+ Property_Address + ", Purcahse_Price=" + Purcahse_Price + ", Down_Payment=" + Down_Payment
				+ ", Purchase_Date=" + Purchase_Date + ", Time=" + Time + ", Purchase_agrement="
				+ Arrays.toString(Purchase_agrement) + ", Loan_option=" + Loan_option + ", Share_Notes=" + Share_Notes
				+ "]";
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getBuyer_Name() {
		return Buyer_Name;
	}
	public void setBuyer_Name(String buyer_Name) {
		Buyer_Name = buyer_Name;
	}
	public String getBuyer_Contact() {
		return Buyer_Contact;
	}
	public void setBuyer_Contact(String buyer_Contact) {
		Buyer_Contact = buyer_Contact;
	}
	public String getProperty_type() {
		return Property_type;
	}
	public void setProperty_type(String property_type) {
		Property_type = property_type;
	}
	public String getProperty_size() {
		return Property_size;
	}
	public void setProperty_size(String property_size) {
		Property_size = property_size;
	}
	public String getProperty_Address() {
		return Property_Address;
	}
	public void setProperty_Address(String property_Address) {
		Property_Address = property_Address;
	}
	public String getPurcahse_Price() {
		return Purcahse_Price;
	}
	public void setPurcahse_Price(String purcahse_Price) {
		Purcahse_Price = purcahse_Price;
	}
	public String getDown_Payment() {
		return Down_Payment;
	}
	public void setDown_Payment(String down_Payment) {
		Down_Payment = down_Payment;
	}
	public Date getPurchase_Date() {
		return Purchase_Date;
	}
	public void setPurchase_Date(Date purchase_Date) {
		Purchase_Date = purchase_Date;
	}
	public LocalTime getTime() {
		return Time;
	}
	public void setTime(LocalTime time) {
		Time = time;
	}
	public byte[] getPurchase_agrement() {
		return Purchase_agrement;
	}
	public void setPurchase_agrement(byte[] purchase_agrement) {
		Purchase_agrement = purchase_agrement;
	}
	public String getLoan_option() {
		return Loan_option;
	}
	public void setLoan_option(String loan_option) {
		Loan_option = loan_option;
	}
	public String getShare_Notes() {
		return Share_Notes;
	}
	public void setShare_Notes(String share_Notes) {
		Share_Notes = share_Notes;
	}
	
}
