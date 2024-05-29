package com.example.demo.entity;

import java.sql.Date;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="inbox_sent_meassges")
public class Inbox {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 
	private String InboxSent_message;
	private Date Sender_Date;
	private Date Recipt_Date;
	@Lob
	@Column(name = "AttachFile",length = 50000000)
	private byte[] AttachFile;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getInboxSent_message() {
		return InboxSent_message;
	}
	public void setInboxSent_message(String inboxSent_message) {
		InboxSent_message = inboxSent_message;
	}
	public Date getSender_Date() {
		return Sender_Date;
	}
	public void setSender_Date(Date sender_Date) {
		Sender_Date = sender_Date;
	}
	public Date getRecipt_Date() {
		return Recipt_Date;
	}
	public void setRecipt_Date(Date recipt_Date) {
		Recipt_Date = recipt_Date;
	}
	public byte[] getAttachFile() {
		return AttachFile;
	}
	public void setAttachFile(byte[] attachFile) {
		AttachFile = attachFile;
	}
	public Inbox(Long id, String inboxSent_message, Date sender_Date, Date recipt_Date, byte[] attachFile) {
		super();
		this.id = id;
		InboxSent_message = inboxSent_message;
		Sender_Date = sender_Date;
		Recipt_Date = recipt_Date;
		AttachFile = attachFile;
	}
	public Inbox() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Inbox [id=" + id + ", InboxSent_message=" + InboxSent_message + ", Sender_Date=" + Sender_Date
				+ ", Recipt_Date=" + Recipt_Date + ", AttachFile=" + Arrays.toString(AttachFile) + "]";
	}
	
	

}
