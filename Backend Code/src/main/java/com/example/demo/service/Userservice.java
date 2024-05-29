package com.example.demo.service;



import java.security.SecureRandom;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Profile;
import com.example.demo.entity.PropertyDetails;
import com.example.demo.entity.PropertyMaintenance;

import com.example.demo.entity.Tentant;

import com.example.demo.entity.User;
import com.example.demo.repository.ProfileRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.tentantRepository;

@Service
public class Userservice {
	
	
	private UserRepository userRepository;
	private ProfileRepository profileRepository;

	public Userservice(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	private static final SecureRandom secureRandom=new SecureRandom();
	private static final Base64.Encoder base64encoder = Base64.getUrlEncoder();
	
	public User register(User user) {
		
		if(checkUserExist(user)==true)
		return null;
		user.setToken(generateToken());
		return userRepository.save(user);
	}
	
	
	
	
	private String generateToken(){
		
		byte[] token=new byte[24]; 
		secureRandom.nextBytes(token);
		return base64encoder.encodeToString(token);
		
	}
	private boolean checkUserExist(User user) {
		
		User existingUser=userRepository.findById(user.getId()).orElse(null);
		if(existingUser==null)
			return false;
		return true;
		
	}
	
	public void registerUser(User user) {
        // You can add validation and other registration logic here
        userRepository.save(user);
    }
	
	
public User login(User user) {
	User existingUser=userRepository.findById(user.getId()).orElse(null);
	if(existingUser !=null && existingUser.getEmail().equals(user.getEmail())&&
	existingUser.getPassword().equals(user.getPassword())) {
		existingUser.setPassword("");
		return existingUser;
	}
		
	
	
	return null;
	}
	
	
	public Profile details(Profile profile)
	
	{
		final SecureRandom secureRandom=new SecureRandom();
		final Base64.Encoder base64encoder = Base64.getUrlEncoder();
		CrudRepository<Profile, Long> profilerepositry = null;
		return profilerepositry.save(profile);
		
	}

//	public PropertyDetails  detail(PropertyDetails  propertydetails) {
//		final SecureRandom secureRandom=new SecureRandom();
//		final Base64.Encoder base64encoder = Base64.getUrlEncoder();
//			PropertyDetails propertyrepository = null;
//		return propertyrepository.save(propertydetails);
//		
//	}
//	public PropertyDetails propertydetail(PropertyMaintenance propertymaintenance) {
//		final SecureRandom secureRandom=new SecureRandom();
//		final Base64.Encoder base64encoder = Base64.getUrlEncoder();
//		PropertyDetails propertyrepository = null;
//		PropertyDetails propertymaintennce = null;
//		return propertyrepository.save(propertymaintennce);
//			
//	}

//public PropertyDetails tentantdeatil(PropertyDetails tentant) {
//	final SecureRandom secureRandom=new SecureRandom();
//	final Base64.Encoder base64encoder = Base64.getUrlEncoder();
//	PropertyDetails tentantrepository = null;
//	return tentantrepository.save(tentant);
//	
//	
//}




public static List<PropertyDetails> getPropertieDetailsByLocation(String location) {
	// TODO Auto-generated method stub
	return null;
}






public byte[] saveImg(byte[] img, String email) {
	return img;
	// TODO Auto-generated method stub
	
}




public ModelAndView addDance(ModelAndView view, Tentant dance, MultipartFile pic) {
	// TODO Auto-generated method stub
	return null;
}




//public User login(User user) {
//	// TODO Auto-generated method stub
//	return null;
//}





//public User loginUser(String email, String password) {
//    // Add logic here to authenticate the user
//    User user = userRepository.findByEmail(email);
//
//    if (user != null && user.getPassword().equals(password)) {
//        return user; // Successful login
//    }
//
//    return null; // Invalid credentials
//}
//
//// Other methods related to user service...
//}



	
}
