package com.example.demo.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.Tentant;
import com.example.demo.repository.tentantRepository;

@Service
public class TenantService {
@Autowired
private tentantRepository tentantrepository;


public String savetentant(MultipartFile file,String Contact,String Security_Deposit,String Amount,String PaymentStatus) throws IOException
{
	
	Tentant image=new Tentant();
	image.setContact(Contact);
	image.setSecurity_Deposit(Security_Deposit);
	image.setAmount(Amount);
	image.setTenatant_picture(file.getBytes());
	image.setUploadlease_agreement(file.getBytes());
	image.setPaymentStatus(PaymentStatus);
	tentantrepository.save(image);
	return "Image saved in Db";
	
}
















}
